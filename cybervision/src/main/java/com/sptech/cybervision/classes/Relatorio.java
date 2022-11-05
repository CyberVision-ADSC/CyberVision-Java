/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.cybervision.classes;

import java.time.LocalDateTime;

/**
 *
 * @author leona
 */
public class Relatorio {
    private Double usoCpu;
    private Long usoDisco;
    private Long usoRam;
    private Boolean problemaCpu;
    private Boolean problemaDisco;
    private Boolean problemaRam;
    private Boolean problemaFisico;
    private String dataHora;

    public Relatorio(Double usoCpu, Long usoDisco, Long usoRam, Boolean problemaCpu, Boolean problemaDisco, Boolean problemaRam, Boolean problemaFisico, String dataHora) {
        this.usoCpu = usoCpu;
        this.usoDisco = usoDisco;
        this.usoRam = usoRam;
        this.problemaCpu = problemaCpu;
        this.problemaDisco = problemaDisco;
        this.problemaRam = problemaRam;
        this.problemaFisico = problemaFisico;
        this.dataHora = dataHora;
    }

   
    

    public Double getUsoCpu() {
        return usoCpu;
    }

    public void setUsoCpu(Double usoCpu) {
        this.usoCpu = usoCpu;
    }

    public Long getUsoDisco() {
        return usoDisco;
    }

    public void setUsoDisco(Long usoDisco) {
        this.usoDisco = usoDisco;
    }

    public Long getUsoRam() {
        return usoRam;
    }

    public void setUsoRam(Long usoRam) {
        this.usoRam = usoRam;
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

    public Boolean getProblemaRam() {
        return problemaRam;
    }

    public void setProblemaRam(Boolean problemaRam) {
        this.problemaRam = problemaRam;
    }

    public Boolean getProblemaFisico() {
        return problemaFisico;
    }

    public void setProblemaFisico(Boolean problemaFisico) {
        this.problemaFisico = problemaFisico;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "Relatorio{" + "usoCpu=" + usoCpu + ", usoDisco=" + usoDisco + ", usoRam=" + usoRam + ", problemaCpu=" + problemaCpu + ", problemaDisco=" + problemaDisco + ", problemaRam=" + problemaRam + ", problemaFisico=" + problemaFisico + ", dataHora=" + dataHora + '}';
    }

   
    
    
    
    
    
}
