/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.cybervision;

import com.github.britooo.looca.api.core.Looca;
import com.sptech.cybervision.classes.Andar;
import com.sptech.cybervision.classes.Faculdade;
import com.sptech.cybervision.classes.Sala;
import com.sptech.cybervision.classes.Usuario;
import com.sptech.cybervision.conexoes.ConexaoAzure;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.springframework.dao.EmptyResultDataAccessException;

/**
 *
 * @author henri
 */
//public class CLI {
//
//    public static void main(String[] args) {
//        Scanner leitor = new Scanner(System.in);
//        ConexaoAzure conexao = new ConexaoAzure();
//        Looca looca = new Looca();
//        Faculdade faculdade = new Faculdade();
//        Usuario usuario = new Usuario();
//        String hostName;
//
//        System.out.println(" __       __   ___  __          __     __       \n"
//                + "/  ` \\ / |__) |__  |__) \\  / | /__` | /  \\ |\\ | \n"
//                + "\\__,  |  |__) |___ |  \\  \\/  | .__/ | \\__/ | \\|");
//
////        System.out.println("Bem vindo, para iniciarmos faça o seu login: ");
////        System.out.println("Digite seu e-mail:");
////        String emailDigitado = leitor.nextLine();
////        System.out.println("Digite sua senha:");
////        String senhaDigitada = leitor.nextLine();
//          String nomeUsuario = "";
//          Boolean error = false;
//          System.out.println("Para iniciarmos faça o seu login: ");
//
//////////LOGIN 
//        do {
//            System.out.println("Digite seu e-mail:");
//            String emailDigitado = leitor.nextLine();
//            System.out.println("Digite sua senha:");
//            String senhaDigitada = leitor.nextLine();
//            error = false;
//            try {
//                Map<String, Object> registro = conexao.getConnection().queryForMap("select * from usuario where email = ? and senha = ?", emailDigitado, senhaDigitada);
//
//                // Instânciando usuário que logou
//                List<Map<String, Object>> listaUsuario = conexao.getConnection().queryForList("select * from usuario where email = ?", emailDigitado);
//                nomeUsuario = listaUsuario.get(0).get("nome").toString();
//                String nivelAcesso = listaUsuario.get(0).get("tipo_usuario").toString();
//                Integer fkFaculdade = Integer.parseInt(listaUsuario.get(0).get("fk_faculdade").toString());
//
//                // Instânciando faculdade que o usuário pertence
//                List<Map<String, Object>> listaFaculdade = conexao.getConnection().queryForList("select * from faculdade where id_faculdade = ?", fkFaculdade);
//                String nomeFantasia = listaFaculdade.get(0).get("nome_fantasia").toString();
//                String razaoSocial = listaFaculdade.get(0).get("razao_social").toString();
//                String cnpj = listaFaculdade.get(0).get("cnpj").toString();
//                String cep = listaFaculdade.get(0).get("cep").toString();
//                Integer numero = Integer.parseInt(listaFaculdade.get(0).get("numero").toString());
//
//            } catch (EmptyResultDataAccessException e) {
//                System.out.println("Email ou senha incorretos!");
//                System.out.println("*'enter' para continuar*");
//                leitor.nextLine();
//                error = true;
//
//            }
//        } while (error);
//        System.out.println("Bem vindo(a)" + nomeUsuario);
//
//////////ASSOCIAR MÁQUINA
//        error = false;
//        do {
//            System.out.println("Associar hostname:");
//            hostName = leitor.nextLine();
//
//            try {
//                Map<String, Object> registroHost = conexao.getConnection().queryForMap(
//                        "select * from computador WHERE hostname = ?", hostName);
//
//                // Pegando fk_sala do computador cujo hostname foi inserido
//                List<Map<String, Object>> listaComputador = conexao.getConnection().queryForList("select * from computador where hostname = ?", hostName);
//                Boolean isAtivoComputador = Boolean.parseBoolean(listaComputador.get(0).get("is_ativo").toString());
//                Integer fkSala = Integer.parseInt(listaComputador.get(0).get("fk_sala").toString());
//                Integer fkComputador = Integer.parseInt(listaComputador.get(0).get("id_computador").toString());
//
//                // Instânciando a sala
//                List<Map<String, Object>> listaSala = conexao.getConnection().queryForList("select * from sala where id_sala = ?", fkSala);
//                String identificadorSala = listaSala.get(0).get("identificador_sala").toString();
//                String descricaoSala = listaSala.get(0).get("descricao_sala").toString();
//                Boolean isAtivoSala = Boolean.parseBoolean(listaSala.get(0).get("is_ativo").toString());
//
//                // Pegando fk_andar 
//                Integer fkAndar = Integer.parseInt(listaSala.get(0).get("fk_andar").toString());
//
//                // Instânciando o andar
//                List<Map<String, Object>> listaAndar = conexao.getConnection().queryForList("select * from andar where id_andar = ?", fkAndar);
//                String identificadorAndar = listaAndar.get(0).get("identificador_andar").toString();
//                String descricaoAndar = listaAndar.get(0).get("descricao_andar").toString();
//                Boolean isAtivoAndar = Boolean.parseBoolean(listaAndar.get(0).get("is_ativo").toString());
//
//                // Objeto do andar
//                Andar andar = new Andar(identificadorAndar, descricaoAndar, isAtivoAndar);
//
//                // Objeto da sala
//                Sala sala = new Sala(identificadorSala, descricaoSala, isAtivoSala);
//
//                // faculdade.adicionarAndar(andar);
//                andar.adicionarSala(sala);
//
//                System.out.println(andar);
//                System.out.println(sala);
//
//                usuario.associarMaquina(hostName, isAtivoComputador, fkComputador, fkSala);
//
//            } catch (EmptyResultDataAccessException e) {
//                System.out.println("Hostname não encontrado!");
//                System.out.println("*'enter' para continuar*");
//                leitor.nextLine();
//                error = true;
//            }
//        } while (error);
//    }
//}
