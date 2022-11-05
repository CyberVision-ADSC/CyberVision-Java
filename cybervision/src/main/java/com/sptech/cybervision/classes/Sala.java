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
public class Sala {
    private String identificadorSala;
    private String descricao;
    private List<Computador> computadores;

    public Sala(String identificadorSala, String descricao) {
        this.identificadorSala = identificadorSala;
        this.descricao = descricao;
        this.computadores = new ArrayList<>();
    }

    public Sala(String identificadorSala, String descricao, List<Computador> computadores) {
        this.identificadorSala = identificadorSala;
        this.descricao = descricao;
        this.computadores = computadores;
    }

    public String getIdentificadorSala() {
        return identificadorSala;
    }

    public void setIdentificadorSala(String identificadorSala) {
        this.identificadorSala = identificadorSala;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Computador> getComputadores() {
        return computadores;
    }

    public void setComputadores(List<Computador> computadores) {
        this.computadores = computadores;
    }
    
    
    
    
    
}
