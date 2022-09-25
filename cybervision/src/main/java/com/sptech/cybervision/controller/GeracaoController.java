/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.cybervision.controller;

import com.sptech.cybervision.config.Conexao;
import com.sptech.cybervision.model.Geracao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marih
 */
public class GeracaoController {
    
    private final Connection connection;
    
    public GeracaoController(Connection connection) {
        this.connection = connection;
    }
    
    public List<Geracao> findAll() {
        try {
            Statement executaQuery = null;
            executaQuery = this.connection.createStatement();
            executaQuery.execute("SELECT * FROM geracao");
            ResultSet result = executaQuery.getResultSet();
            List<Geracao> geracaoList = new ArrayList<>();
            while (result.next()) {
                Geracao geracao = new Geracao();
                geracao.setId(result.getInt("id"));
                geracao.setRegiao(result.getString("regiao"));
                geracaoList.add(geracao);
            }
            return geracaoList;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return null;
    }
    
    public Geracao findById(Integer id) {
        return null;
    }
    
    public Boolean insert(Geracao geracao) {
        return null;
    }
    
    public Boolean update(Geracao geracao, Integer id) {
        return null;
    }
    
    public Boolean delete(Integer id) {
        return null;
    }
}
