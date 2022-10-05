package com.sptech.cybervision;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.sistema.Sistema;
import com.sptech.cybervision.config.Conexao;
import com.sptech.cybervision.controller.GeracaoController;
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
        GeracaoController controller = new GeracaoController(Conexao.getConnection());
        System.out.println(controller.findAll());
    }
}
