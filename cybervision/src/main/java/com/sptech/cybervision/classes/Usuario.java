/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.cybervision.classes;

import com.sptech.cybervision.conexoes.Conexao;
import com.sptech.cybervision.view.AssociarMaquina;
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

    public Usuario(String nome, String email, String senha, String nivelAcesso) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }
    
    public void entrar(){
    
    
    }
    
    public void associarMaquina(){
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
