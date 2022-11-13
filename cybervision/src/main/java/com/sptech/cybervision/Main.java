package com.sptech.cybervision;

import com.github.britooo.looca.api.core.Looca;
import com.sptech.cybervision.conexoes.Conexao;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author marih
 */
public class Main {

    public static void main(String[] args) throws SQLException {

        Looca looca = new Looca();
        Integer usoCpu = looca.getProcessador().getUso().intValue();
         System.out.println(usoCpu);
       


    }
}
