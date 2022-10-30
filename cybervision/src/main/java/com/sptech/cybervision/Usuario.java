/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.cybervision;

import com.sptech.cybervision.Login;
import com.sptech.cybervision.AssociarMaquina;
import com.sptech.cybervision.Conexao;
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

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
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

}
