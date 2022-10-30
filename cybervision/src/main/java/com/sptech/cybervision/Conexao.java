/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.cybervision;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author leona
 */
public class Conexao {

    JdbcTemplate jdbcTemplate;
    
    public Conexao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Conexao() {

        BasicDataSource dataSource = new BasicDataSource();
        
        //CONEXÃO MYSQL
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");

        dataSource.setUrl("jdbc:mysql://localhost:3306/cybervision");

        dataSource.setUsername("root");

        dataSource.setPassword("nacagawa1333");
        
        
        //CONEXÃO SQLSERVER AZURE
//        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//
//        dataSource.setUrl("jdbc:sqlserver://cybervision-server.database.windows.net:1433;database=cybervision");
//
//        dataSource.setUsername("admin-cybervision");
//
//        dataSource.setPassword("#Gfgrupo4");
        
        
        //CONEXÃO DOCKER
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//
//        dataSource.setUrl("jdbc:mysql://172.17.0.2:3306/cybervision");
//
//        dataSource.setUsername("root");
//
//        dataSource.setPassword("urubu100");

        jdbcTemplate = new JdbcTemplate(dataSource);
    }

}
