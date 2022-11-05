/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.cybervision.conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.UIManager.getInt;

/**
 *
 * @author leona
 */
public class Conex {
    public static void main(String[] args) {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/cybervision", "root", "nacagawa1333");
            
//            List<Map<String, Object>> lista = ("select * from tbl_pais");
            
          
        } catch(ClassNotFoundException ex){
            System.out.println("Driver do banco não localizado");
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao acessar o banco: " + ex.getMessage());
        }
    }
    
}
