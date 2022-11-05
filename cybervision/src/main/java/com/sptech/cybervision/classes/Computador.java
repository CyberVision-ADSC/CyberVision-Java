/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.cybervision.classes;

import com.sptech.cybervision.classes.Processo;
import com.sptech.cybervision.classes.Relatorio;
import java.util.ArrayList;
import java.util.List;

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

    public Computador(String hostname, String processador, Integer arquitetura, String fabricante, Long ram, Long disco, String sistemaOperacional, Boolean ativo, List<Relatorio> relatorios, List<Processo> processos) {
        this.hostname = hostname;
        this.processador = processador;
        this.arquitetura = arquitetura;
        this.fabricante = fabricante;
        this.ram = ram;
        this.disco = disco;
        this.sistemaOperacional = sistemaOperacional;
        this.ativo = ativo;
        this.relatorios = relatorios;
        this.processos = processos;
    }
    
    public void coletarRelatorios(){
        
    
    }
    
    public void coletarProcessos(){
    
    
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

}
