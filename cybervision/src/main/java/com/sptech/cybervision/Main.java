package com.sptech.cybervision;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.sistema.Sistema;
import com.sptech.cybervision.conexoes.Conexao;
import com.sptech.cybervision.classes.Faculdade;
import com.sptech.cybervision.conexoes.Conex;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

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

        Conexao conexao = new Conexao();
        
        
        List<Map<String, Object>> lista = conexao.getConnection().queryForList("select * from faculdade");
        
        System.out.println(lista.get(0).get("nome_fantasia"));
        
        String armazenar = lista.get(0).get("nome_fantasia").toString();
        
        System.out.println(armazenar);
     

        

    }
}
