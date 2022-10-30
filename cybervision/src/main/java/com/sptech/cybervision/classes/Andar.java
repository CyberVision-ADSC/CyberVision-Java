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
public class Andar {
    private String identificadorAndar;
    private String descricao;
    private List<Sala> salas;

    public Andar(String identificadorAndar, String descricao) {
        this.identificadorAndar = identificadorAndar;
        this.descricao = descricao;
        this.salas = new ArrayList<>();
    }

    public Andar(String identificadorAndar, String descricao, List<Sala> salas) {
        this.identificadorAndar = identificadorAndar;
        this.descricao = descricao;
        this.salas = salas;
    }

    public String getIdentificadorAndar() {
        return identificadorAndar;
    }

    public void setIdentificadorAndar(String identificadorAndar) {
        this.identificadorAndar = identificadorAndar;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }
    
    
    
    
       
}
