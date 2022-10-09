package com.sptech.cybervision;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.sistema.Sistema;
import oshi.hardware.CentralProcessor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author marih
 */
public class Main {

    public static void main(String[] args) {
        
        
        Looca looca = new Looca();
        Sistema sistema = looca.getSistema();
        
        sistema.getPermissao();
        sistema.getFabricante();
        sistema.getArquitetura();
        sistema.getInicializado();
        sistema.getSistemaOperacional();
        sistema.getTempoDeAtividade();

        System.out.println(sistema);
        
       
    }
}
