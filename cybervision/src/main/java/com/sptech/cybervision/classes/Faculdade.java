/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.cybervision.classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leona
 */
public class Faculdade {
    private Integer idFaculdade;
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private String cep;
    private Integer numero;
    private List<Usuario> usuarios;
    private List<Andar> andares;

    public Faculdade(Integer idFaculdade, String nomeFantasia, String razaoSocial, String cnpj, String cep, Integer numero) {
        this.idFaculdade = idFaculdade;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.cep = cep;
        this.numero = numero;
        this.andares = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }
    
    

    public Integer getIdFaculdade() {
        return idFaculdade;
    }

    public void setIdFaculdade(Integer idFaculdade) {
        this.idFaculdade = idFaculdade;
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
