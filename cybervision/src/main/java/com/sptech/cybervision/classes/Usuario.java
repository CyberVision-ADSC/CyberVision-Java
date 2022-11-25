/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.cybervision.classes;

import com.github.britooo.looca.api.core.Looca;
import com.sptech.cybervision.conexoes.Conexao;
import com.sptech.cybervision.conexoes.ConexaoDocker;
import com.sptech.cybervision.view.AssociarMaquina;
import com.sptech.cybervision.view.Logado;

/**
 *
 * @author leona
 */
public class Usuario {

    private String nome;
    private String email;
    private String senha;
    private String nivelAcesso;

    Conexao conexao = new Conexao();
    ConexaoDocker conexaoDocker = new ConexaoDocker();
    AssociarMaquina associar = new AssociarMaquina();
    Looca looca = new Looca();
    Logado logado = new Logado();
    Sala sala = new Sala();

    public Usuario(String nome, String email, String senha, String nivelAcesso) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public Usuario() {
    }

    public void associarMaquina(String hostName, Boolean isAtivoComputador, Integer fkComputador, Integer fkSala) {

        Long converteGiga = 1073741824l; // Conversor de bytes para Giga
        
        // Usando o looca para pegar informações da máquina
        String nomeProcessador = looca.getProcessador().getNome();
        Integer arquitetura = looca.getSistema().getArquitetura();
        String fabricante = looca.getSistema().getFabricante();
        Long memoriaRam = looca.getMemoria().getTotal() / converteGiga;
        Long tamanhoDisco = looca.getGrupoDeDiscos().getTamanhoTotal() / converteGiga;
        String sistemaOperacional = looca.getSistema().getSistemaOperacional();

        // Atualizando a máquina no banco com os dados coletados
//        conexao.getConnection().update(
//                "UPDATE computador SET processador = ?, arquitetura = ?, "
//                + "fabricante = ?, ram = ?, disco = ?, sistema_operacional = ?, "
//                + "problema_cpu = ?, problema_disco = ?, problema_memoria = ?, problema_fisico = ?,"
//                + " is_ativo = ? WHERE hostname = ?",
//                nomeProcessador, arquitetura, fabricante, memoriaRam,
//                tamanhoDisco, sistemaOperacional, false, false, false, false, isAtivoComputador, hostName);
//        
         conexaoDocker.getConexaoDocker().update(
                "UPDATE computador SET processador = ?, arquitetura = ?, "
                + "fabricante = ?, ram = ?, disco = ?, sistema_operacional = ?, "
                + "problema_cpu = ?, problema_disco = ?, problema_memoria = ?, problema_fisico = ?,"
                + " is_ativo = ? WHERE hostname = ?",
                nomeProcessador, arquitetura, fabricante, memoriaRam,
                tamanhoDisco, sistemaOperacional, false, false, false, false, isAtivoComputador, hostName);

        // Instânciando a máquina atualizada
        Computador computador = new Computador(hostName, nomeProcessador,
                arquitetura, fabricante, memoriaRam, tamanhoDisco,
                sistemaOperacional, false, false, false, false, isAtivoComputador);

        // sala.adicionarComputador(computador);
        System.out.println(computador.toString());

        // Chamando função para coletar relatórios e processos da máquina
        computador.coletarRelatoriosProcessos(fkComputador, fkSala, hostName);

    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public String toString() {
        return "\nUsuario = " + "Nome:" + nome + ", Email: " + email + ", Senha: " + senha + ", Nivel de acesso" + nivelAcesso;
    }

}
