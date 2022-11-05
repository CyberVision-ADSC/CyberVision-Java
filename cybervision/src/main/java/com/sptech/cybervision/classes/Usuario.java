/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.cybervision.classes;

import com.github.britooo.looca.api.core.Looca;
import com.sptech.cybervision.conexoes.Conexao;
import com.sptech.cybervision.view.AssociarMaquina;
import com.sptech.cybervision.view.Logado;
import java.util.Map;
import javax.swing.JOptionPane;
import org.springframework.dao.EmptyResultDataAccessException;

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
    AssociarMaquina associar = new AssociarMaquina();
    Looca looca = new Looca();
    Logado logado = new Logado();

    public Usuario(String nome, String email, String senha, String nivelAcesso) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public Usuario() {
    }

    public void associarMaquina(String hostName) {

        String nomeProcessador = looca.getProcessador().getNome();
        Integer arquitetura = looca.getSistema().getArquitetura();
        String fabricante = looca.getSistema().getFabricante();
        Long memoriaRam = looca.getMemoria().getTotal() / 1000000;
        Long tamanhoDisco = looca.getGrupoDeDiscos().getTamanhoTotal() / 1000000;
        String sistemaOperacional = looca.getSistema().getSistemaOperacional();

            conexao.getConnection().update(
                    "UPDATE computador SET processador = ?, arquitetura = ?, "
                    + "fabricante = ?, ram = ?, disco = ?, sistema_operacional = ?, "
                    + "ativo = ? WHERE hostname = ?",
                    nomeProcessador, arquitetura, fabricante, memoriaRam,
                    tamanhoDisco, sistemaOperacional, true, hostName);

            Computador computador = new Computador(hostName, nomeProcessador,
                    arquitetura, fabricante, memoriaRam, tamanhoDisco,
                    sistemaOperacional, true);
            
            System.out.println(computador.toString());
            
            computador.coletarRelatoriosProcessos();

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
        return "Usuario{" + "nome=" + nome + ", email=" + email + ", senha=" + senha + ", nivelAcesso=" + nivelAcesso + '}';
    }

}
