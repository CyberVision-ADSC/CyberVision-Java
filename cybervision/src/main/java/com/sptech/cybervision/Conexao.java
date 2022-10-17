/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.cybervision;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.sistema.Sistema;
import java.util.Map;
import javax.swing.JOptionPane;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.dao.EmptyResultDataAccessException;
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

//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//
//        dataSource.setUrl("jdbc:mysql://localhost:3306/cybervision");
        
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
        
        dataSource.setUrl("jdbc:sqlserver://cybervision-server.database.windows.net/cybervision");

        dataSource.setUsername("admin-cybervision");

        dataSource.setPassword("#Gfgrupo4");

        jdbcTemplate = new JdbcTemplate(dataSource);
    }


}
