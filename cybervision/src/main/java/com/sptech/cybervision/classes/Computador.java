/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.cybervision.classes;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Volume;
import com.sptech.cybervision.conexoes.Conexao;
import com.sptech.cybervision.view.AssociarMaquina;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.springframework.dao.EmptyResultDataAccessException;

/**
 *
 * @author leona
 */
public class Computador {

    private String hostname;
    private String processador;
    private Integer arquitetura;
    private String fabricante;
    private Long ram;
    private Long disco;
    private String sistemaOperacional;
    private Boolean ativo;
    private List<Relatorio> relatorios;
    private List<Processo> processos;
    private Integer contadorRelatorios = 10;

    public Computador(String hostname, String processador, Integer arquitetura, String fabricante, Long ram, Long disco, String sistemaOperacional, Boolean ativo) {
        this.hostname = hostname;
        this.processador = processador;
        this.arquitetura = arquitetura;
        this.fabricante = fabricante;
        this.ram = ram;
        this.disco = disco;
        this.sistemaOperacional = sistemaOperacional;
        this.ativo = ativo;
        this.relatorios = new ArrayList<>();
        this.processos = new ArrayList<>();

    }

    public Computador() {
    }

    Conexao conexao = new Conexao();
    AssociarMaquina associar = new AssociarMaquina();
    Looca looca = new Looca();

    public void coletarRelatoriosProcessos(Integer fkComputador, Integer fkSala) {

        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Long converteGiga = 1073741824L;
                Long converteMega = 1048576L;
                Long totalDisco = 0L;
                Long totalDiscoDisponivel = 0L;

                for (Volume volume : looca.getGrupoDeDiscos().getVolumes()) {
                    totalDisco += volume.getTotal();
                }

                for (Volume volume : looca.getGrupoDeDiscos().getVolumes()) {
                    totalDiscoDisponivel += volume.getDisponivel();
                }

                Long totalDiscoGiga = totalDisco / converteGiga;

                Long totalDiscoDisponivelGiga = totalDiscoDisponivel / converteGiga;

                Long multiplicacaoDiscoDisponivelX100 = totalDiscoDisponivelGiga * 100;

                Long divisaoMultiporDiscoGiga = multiplicacaoDiscoDisponivelX100 / totalDiscoGiga;

                Long totalRam = looca.getMemoria().getTotal() / 1048576L;

                Long usoRamTotal = looca.getMemoria().getEmUso() / 1048576L;

                Long multiplicacaoUsoXCem = usoRamTotal * 100;

                Integer usoCpu = looca.getProcessador().getUso().intValue();
                Long usoDisco = 100 - divisaoMultiporDiscoGiga;
                Long usoRam = multiplicacaoUsoXCem / totalRam;
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                String dataHora = dtf.format(LocalDateTime.now());

                //IMPLEMENTAR ALERTAS
                Boolean problemaCpu = false;
                Boolean problemaDisco = false;
                Boolean problemaMemoria = false;

                if (usoDisco >= 90) {
                    problemaDisco = true;
                }

                if (usoRam >= 90) {
                    problemaMemoria = true;
                }

                if (usoCpu >= 80) {
                    contadorRelatorios--;

                } else {
                    contadorRelatorios = 10;
                }

                if (contadorRelatorios == 0) {
                    problemaCpu = true;
                }

                conexao.getConnection().update(
                        "INSERT INTO relatorio (uso_cpu, uso_disco, uso_ram, problema_cpu,"
                        + " problema_disco, problema_memoria, problema_fisico, data_hora, fk_computador,"
                        + " fk_sala) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                        usoCpu, usoDisco, usoRam, problemaCpu, problemaDisco, problemaMemoria, false,
                        dataHora, fkComputador, fkSala);

                Relatorio relatorio = new Relatorio(usoCpu, usoDisco, usoRam, true, true, true, false, dataHora);
                relatorios.add(relatorio);

                System.out.println(relatorio);

                for (com.github.britooo.looca.api.group.processos.Processo processo : looca.getGrupoDeProcessos().getProcessos()) {
                    Integer pidProcesso = processo.getPid();
                    String nomeProcesso = processo.getNome();
                    Double usoCpuProcesso = processo.getUsoCpu();
                    Double usoMemoriaProcesso = processo.getUsoMemoria();

                    List<Map<String, Object>> registroProcesso = conexao.getConnection().queryForList("select * from processo where pid = ? and fk_computador = ?", pidProcesso, fkComputador);
                    
                    if (registroProcesso.isEmpty()) {

                        conexao.getConnection().update(
                                "INSERT INTO processo (pid, nome, uso_cpu, uso_memoria, fk_computador)"
                                + " VALUES (?, ?, ?, ?, ?)",
                                pidProcesso, nomeProcesso, usoCpuProcesso, usoMemoriaProcesso, fkComputador);

                        Processo process = new Processo(pidProcesso, nomeProcesso,
                                usoCpuProcesso, usoMemoriaProcesso);

                        processos.add(process);

                        System.out.println(process);

                    } else {
                        conexao.getConnection().update(
                                "UPDATE processo SET uso_cpu = ?, uso_memoria = ? WHERE pid = ?",
                                usoCpuProcesso, usoMemoriaProcesso, pidProcesso);

                    }

                }

            }
        }, 0, 5000);

    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public Integer getArquitetura() {
        return arquitetura;
    }

    public void setArquitetura(Integer arquitetura) {
        this.arquitetura = arquitetura;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Long getRam() {
        return ram;
    }

    public void setRam(Long ram) {
        this.ram = ram;
    }

    public Long getDisco() {
        return disco;
    }

    public void setDisco(Long disco) {
        this.disco = disco;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public List<Relatorio> getRelatorios() {
        return relatorios;
    }

    public void setRelatorios(List<Relatorio> relatorios) {
        this.relatorios = relatorios;
    }

    public List<Processo> getProcessos() {
        return processos;
    }

    public void setProcessos(List<Processo> processos) {
        this.processos = processos;
    }

    public Integer getContadorRelatorios() {
        return contadorRelatorios;
    }

    public void setContadorRelatorios(Integer contadorRelatorios) {
        this.contadorRelatorios = contadorRelatorios;
    }

    @Override
    public String toString() {
        return "\nComputador:"
                + "\nHostname :" + hostname
                + "\nProcessador: " + processador
                + "\nArquitetura: " + arquitetura
                + "\nFabricante: " + fabricante
                + "\nMemória Ram: " + ram
                + "\nDisco: " + disco
                + "\nSistema operacional: " + sistemaOperacional
                + "\nAtivo: " + ativo
                + "\nRelatórios: " + relatorios
                + "\nProcessos: " + processos;

    }

}
