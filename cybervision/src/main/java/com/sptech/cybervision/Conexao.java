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
//    private static final String DRIVER_AZURE = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//    private static final String URL_AZURE = "jdbc:sqlserver://cybervision-server.database.windows.net:1433;database=cybervision";
//    private static final String DRIVER_LOCAL = "com.mysql.cj.jdbc.Driver";
//    private static final String URL_LOCAL = "jdbc:mysql://localhost:3306/cybervision";

    public Conexao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Conexao() {

        BasicDataSource dataSource = new BasicDataSource();

//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//
//        dataSource.setUrl("jdbc:mysql://localhost:3306/cybervision");
//        
//        dataSource.setDriverClassName(DRIVER_AZURE); 
//        
//        dataSource.setUrl(URL_AZURE);
//
//        dataSource.setUsername("admin-cybervision");
//
//        dataSource.setPassword("#Gfgrupo4");
        
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver"); 
        
        dataSource.setUrl("jdbc:mysql://172.17.0.2:3306/cybervision");

        dataSource.setUsername("root");

        dataSource.setPassword("urubu100");

        jdbcTemplate = new JdbcTemplate(dataSource);
    }


}
