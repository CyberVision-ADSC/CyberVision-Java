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
public class Conexao {

    private JdbcTemplate connection;

    public Conexao() {

        // CONEXÃO MYSQL OU DOCKER
        BasicDataSource dataSource = new BasicDataSource();

        dataSource​.setDriverClassName("com.mysql.cj.jdbc.Driver");

        dataSource​.setUrl("jdbc:mysql://localhost:3306/cybervision");

        dataSource​.setUsername("root");

        dataSource​.setPassword("1234");

        // CONEXÃO SQLSERVER AZURE
//        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//
//        dataSource.setUrl("jdbc:sqlserver://cybervision-server.database.windows.net:1433;database=cybervision");
//
//        dataSource.setUsername("admin-cybervision");
//
//        dataSource.setPassword("#Gfgrupo4");

        this.connection = new JdbcTemplate(dataSource);

    }

    public JdbcTemplate getConnection() {

        return connection;

    }

}
