/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.cybervision.config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author marih
 */
// classe de conexao
public class Conexao {

    private static final String SERVER_NAME = "localhost";    //caminho do servidor do BD

    private static final String MY_DATABASE = "pokemon";

    private static final String URL = "jdbc:mysql://" + SERVER_NAME + "/" + MY_DATABASE;

    private static final String USERNAME = "root"; //nome de um usuário de seu BD

    private static final String PASSWORD = "Cpf52355271860";
    
    public static Connection getConnection() {
        Connection connection = null;
        try {
            String driveName = "com.mysql.cj.jdbc.Driver";
            Class.forName(driveName);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (connection != null) {
                System.out.println("Conexão realizada com sucesso!!!");
            } else {
                System.out.println("Não foi possivel realizar a conexão!!");
            }
            return connection;
        } catch (Exception e) {
            System.out.println(String.format("Houve uma falha ao se conectar ao banco: %s", e.getMessage()));
            return null;
        }
    }
    
    public static void fecharConexao() {
        try {
            Conexao.getConnection().close();
            System.out.println("Conexão fechada com sucesso");
        } catch(Exception e) {
            System.out.println("Não foi possivel fechar a conexão" + e);
        }
    }
}
