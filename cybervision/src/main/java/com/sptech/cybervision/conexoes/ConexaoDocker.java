/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.cybervision.conexoes;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author leona
 */
public class ConexaoDocker {
    
    private JdbcTemplate conexaoDocker;

    public ConexaoDocker() {

        // CONEXÃO MYSQL OU DOCKER
        BasicDataSource dataSource = new BasicDataSource();

        dataSource​.setDriverClassName("com.mysql.cj.jdbc.Driver");

        dataSource​.setUrl("jdbc:mysql://localhost:3306/cybervision");

        dataSource​.setUsername("ubuntu");

        dataSource​.setPassword("urubu100");

        this.conexaoDocker = new JdbcTemplate(dataSource);

    }

    public JdbcTemplate getConexaoDocker() {

        return conexaoDocker;

    }
    
}
