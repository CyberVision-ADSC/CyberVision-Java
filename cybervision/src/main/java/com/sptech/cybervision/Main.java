package com.sptech.cybervision;

import com.sptech.cybervision.config.Conexao;
import com.sptech.cybervision.controller.GeracaoController;

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
