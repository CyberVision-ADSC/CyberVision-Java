/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.cybervision.classes;

import com.sptech.cybervision.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leona
 */
public class Faculdade {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private String cep;
    private Integer numero;
    private List<Usuario> usuarios;
    private List<Andar> andares;
    
    
    
     public Faculdade(String nomeFantasia, String razaoSocial, String cnpj, String cep, Integer numero) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.cep = cep;
        this.numero = numero;
        this.usuarios = new ArrayList<>();
        this.andares = new ArrayList<>();
    }

    public Faculdade(String nomeFantasia, String razaoSocial, String cnpj, String cep, Integer numero, List<Usuario> usuarios, List<Andar> andares) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.cep = cep;
        this.numero = numero;
        this.usuarios = usuarios;
        this.andares = andares;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Andar> getAndares() {
        return andares;
    }

    public void setAndares(List<Andar> andares) {
        this.andares = andares;
    }
    
    

   
    
    
    
    
    
}