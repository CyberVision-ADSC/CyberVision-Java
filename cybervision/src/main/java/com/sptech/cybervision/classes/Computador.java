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
import logs.criadorLogs;

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
    private Boolean problemaCpu;
    private Boolean problemaDisco;
    private Boolean problemaMemoria;
    private Boolean problemaFisico;
    private Boolean isAtivo;
    private List<Relatorio> relatorios;
    private List<Processo> processos;

    public Computador(String hostname, String processador, Integer arquitetura, String fabricante, Long ram, Long disco, String sistemaOperacional, Boolean problemaCpu, Boolean problemaDisco, Boolean problemaMemoria, Boolean problemaFisico, Boolean isAtivo) {
        this.hostname = hostname;
        this.processador = processador;
        this.arquitetura = arquitetura;
        this.fabricante = fabricante;
        this.ram = ram;
        this.disco = disco;
        this.sistemaOperacional = sistemaOperacional;
        this.problemaCpu = problemaCpu;
        this.problemaDisco = problemaDisco;
        this.problemaMemoria = problemaMemoria;
        this.problemaFisico = problemaFisico;
        this.isAtivo = isAtivo;
        this.relatorios = new ArrayList<>();
        this.processos = new ArrayList<>();
    }

    public Computador() {
    }

    Conexao conexao = new Conexao();
    AssociarMaquina associar = new AssociarMaquina();
    Looca looca = new Looca();
    criadorLogs cl = new criadorLogs();

    //Quantidade de relatórios mínimos para gerar alerta na CPU
    private Integer contadorRelatorios = 10;

    public void coletarRelatoriosProcessos(Integer fkComputador, Integer fkSala, String hostName) {

        //Temporizador que é executado a cada 5 segundos coletando relatórios e processos
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Long converteGiga = 1073741824L; // Converte para Giga os valores em bytes

                Long totalDisco = 0L;
                Long totalDiscoDisponivel = 0L;

                for (Volume volume : looca.getGrupoDeDiscos().getVolumes()) {
                    totalDisco += volume.getTotal();
                }

                for (Volume volume : looca.getGrupoDeDiscos().getVolumes()) {
                    totalDiscoDisponivel += volume.getDisponivel();
                }

                // Regra de três e conversões para passar os valores de consumo para porcentagem
                Long totalDiscoGiga = totalDisco / converteGiga;
                Long totalDiscoDisponivelGiga = totalDiscoDisponivel / converteGiga;
                Long multiplicacaoDiscoDisponivelX100 = totalDiscoDisponivelGiga * 100;
                Long divisaoMultiporDiscoGiga = multiplicacaoDiscoDisponivelX100 / totalDiscoGiga;
                Long totalRam = looca.getMemoria().getTotal() / 1048576L;
                Long usoRamTotal = looca.getMemoria().getEmUso() / 1048576L;
                Long multiplicacaoUsoXCem = usoRamTotal * 100;

                // Uso de cada componente do hardware convertido em porcentagem.
                Integer usoCpu = looca.getProcessador().getUso().intValue();
                Long usoDisco = 100 - divisaoMultiporDiscoGiga;
                Long usoRam = multiplicacaoUsoXCem / totalRam;

                // Pegando data e hora do momento que o relatório é gerado
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");
                String dataHora = dtf.format(LocalDateTime.now());

                // Inserindo relatórios na tabela
                conexao.getConnection().update(
                        "INSERT INTO relatorio (uso_cpu, uso_disco, uso_ram, data_hora, fk_computador,"
                        + " fk_sala) VALUES (?, ?, ?, ?, ?, ?)",
                        usoCpu, usoDisco, usoRam, dataHora, fkComputador, fkSala);

                // Instânciando cada relatório gerado
                Relatorio relatorio = new Relatorio(usoCpu, usoDisco, usoRam, dataHora);
                relatorios.add(relatorio);

                System.out.println(relatorio);

                // Variáveis que indicam que se o componente está com problema ou não sendo criadas
                Boolean problemaCpuRelatorio = false;
                Boolean problemaDiscoRelatorio = false;
                Boolean problemaMemoriaRelatorio = false;
                Boolean problemaFisicoRelatorio = false;
                criadorLogs cl = new criadorLogs();

                DateTimeFormatter dtft = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                String dataHoraText = dtft.format(LocalDateTime.now());

                // Se o DISCO estiver com mais de 90% sendo usado é gerado o alerta
                if (usoDisco >= 90) {
                    problemaDiscoRelatorio = true;
                    cl.logAlerta(String.format("C:\\Users\\Gabriel\\OneDrive\\Ambiente de Trabalho\\Documentos\\CYBERVISION_OFC\\CyberVision-Java\\cybervision\\logs\\alertas\\%s-Log-alertas", dataHora), "\n A máquina ", hostName, " esta com o disco com uso em nível critico de ", usoDisco.toString(), "% ás", dataHoraText);

                }

                // Se a RAM estiver com mais de 90% sendo usado é gerado o alerta
                if (usoRam >= 90) {
                    problemaMemoriaRelatorio = true;
                    cl.logAlerta(String.format("C:\\Users\\Gabriel\\OneDrive\\Ambiente de Trabalho\\Documentos\\CYBERVISION_OFC\\CyberVision-Java\\cybervision\\logs\\alertas\\%s-Log-alertas", dataHora), "\n A máquina ", hostName, " esta com a ram com uso em nível critico de ", usoRam.toString(), "% ás", dataHoraText);
                }

                // Se a CPU estiver com mais de 80% sendo usado em 10 relatórios seguidos 
                // é gerado o alerta
                if (usoCpu >= 80) {
                    contadorRelatorios--;

                    if (contadorRelatorios <= 0) {
                        problemaCpuRelatorio = true;
                        cl.logAlerta(String.format("C:\\Users\\Gabriel\\OneDrive\\Ambiente de Trabalho\\Documentos\\CYBERVISION_OFC\\CyberVision-Java\\cybervision\\logs\\alertas\\%s-Log-alertas", dataHora), "\n A máquina ", hostName, " esta com a cpu com uso em nível critico de ", usoCpu.toString(), "% ás", dataHoraText);
                    }

                } else {
                    contadorRelatorios = 10;
                }

                // Alertas na tabela do computador sendo atualizados 
                conexao.getConnection().update(
                        "UPDATE computador SET problema_cpu = ?, problema_disco = ?, "
                        + "problema_memoria = ?, problema_fisico = ? "
                        + "WHERE id_computador = ?", problemaCpuRelatorio,
                        problemaDiscoRelatorio, problemaMemoriaRelatorio,
                        problemaFisicoRelatorio, fkComputador);

                // Pegando todos os processos que estão ocorrendo na máquina
                for (com.github.britooo.looca.api.group.processos.Processo processo : looca.getGrupoDeProcessos().getProcessos()) {
                    Integer pidProcesso = processo.getPid();
                    String nomeProcesso = processo.getNome();
                    Double usoCpuProcesso = processo.getUsoCpu();
                    Double usoMemoriaProcesso = processo.getUsoMemoria();

                    // Validando se o processo existe ou não na tabela pelo pid e fk do computador
                    List<Map<String, Object>> registroProcesso = conexao.getConnection().queryForList("select * from processo where pid = ? and fk_computador = ?", pidProcesso, fkComputador);

                    // Se o processo não existir, ele é inserido.
                    if (registroProcesso.isEmpty()) {

                        conexao.getConnection().update(
                                "INSERT INTO processo (pid, nome, uso_cpu, uso_memoria, fk_computador)"
                                + " VALUES (?, ?, ?, ?, ?)",
                                pidProcesso, nomeProcesso, usoCpuProcesso, usoMemoriaProcesso, fkComputador);

                        // Instânciando processo inserido
                        Processo process = new Processo(pidProcesso, nomeProcesso,
                                usoCpuProcesso, usoMemoriaProcesso);

                        processos.add(process);
                        System.out.println(process);

                    } else {
                        // Se o processo existir na tabela ele é apenas atualizado com dados atuais
                        conexao.getConnection().update(
                                "UPDATE processo SET uso_cpu = ?, uso_memoria = ? WHERE pid = ?",
                                usoCpuProcesso, usoMemoriaProcesso, pidProcesso);
                    }
                }
                DateTimeFormatter dtlog = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                String dataHoraLog = dtlog.format(LocalDateTime.now());

                DateTimeFormatter dtfp = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                String dataHoraTexto = dtfp.format(LocalDateTime.now());

                cl.logConexao(String.format("C:\\Users\\Gabriel\\OneDrive\\Ambiente de Trabalho\\Documentos\\CYBERVISION_OFC\\CyberVision-Java\\cybervision\\logs\\banco-de-dados\\%s-Log-Status-BD", dataHoraLog), "\n A máquina ", hostName, " Inseriu no banco ás ", dataHoraTexto);
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

    public Boolean getProblemaCpu() {
        return problemaCpu;
    }

    public void setProblemaCpu(Boolean problemaCpu) {
        this.problemaCpu = problemaCpu;
    }

    public Boolean getProblemaDisco() {
        return problemaDisco;
    }

    public void setProblemaDisco(Boolean problemaDisco) {
        this.problemaDisco = problemaDisco;
    }

    public Boolean getProblemaMemoria() {
        return problemaMemoria;
    }

    public void setProblemaMemoria(Boolean problemaMemoria) {
        this.problemaMemoria = problemaMemoria;
    }

    public Boolean getProblemaFisico() {
        return problemaFisico;
    }

    public void setProblemaFisico(Boolean problemaFisico) {
        this.problemaFisico = problemaFisico;
    }

    public Boolean getAtivo() {
        return isAtivo;
    }

    public void setAtivo(Boolean ativo) {
        this.isAtivo = ativo;
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
                + "\nMemoria Ram: " + ram
                + "\nDisco: " + disco
                + "\nSistema operacional: " + sistemaOperacional
                + "\nAtivo: " + isAtivo
                + "\nRelatorios: " + relatorios
                + "\nProcessos: " + processos;

    }

}
