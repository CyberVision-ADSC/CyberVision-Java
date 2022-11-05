/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.cybervision.conexoes;

import java.sql.DriverManager;
import java.sql.ResultSet;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author leona
 */
public class Conexao {

    private JdbcTemplate connection;

    public Conexao() {
        
        BasicDataSource dataSource = new BasicDataSource();

        dataSource​.setDriverClassName("com.mysql.cj.jdbc.Driver");

        dataSource​.setUrl("jdbc:mysql://localhost:3306/cybervision");

        dataSource​.setUsername("root");

        dataSource​.setPassword("nacagawa1333");

        this.connection = new JdbcTemplate(dataSource);

    }

    public JdbcTemplate getConnection() {

        return connection;

    }

}
