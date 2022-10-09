/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.cybervision;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.sistema.Sistema;
import com.sptech.cybervision.view.AssociarMaquina;
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

    private JdbcTemplate jdbcTemplate;
    private Boolean isLogado;

    public Conexao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Conexao() {

        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");

        dataSource.setUrl("jdbc:mysql://localhost:3306/cybervision");

        dataSource.setUsername("root");

        dataSource.setPassword("nacagawa1333");

        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void recuperar(String emailDigitado, String senhaDigitada) {
       
        try {
            Map<String, Object> registro = jdbcTemplate.queryForMap("select * from usuario where email = ? and senha = ?", emailDigitado, senhaDigitada);
            System.out.println("LOGADO");
            System.out.println(registro);
      
        } catch (EmptyResultDataAccessException e) {
            System.out.println("NÃO LOGOU");
           
           
        }
       
    }

}
