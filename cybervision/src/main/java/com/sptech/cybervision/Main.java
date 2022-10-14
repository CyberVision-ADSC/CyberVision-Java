package com.sptech.cybervision;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscosGroup;
import com.github.britooo.looca.api.group.processos.Processo;
import com.github.britooo.looca.api.group.processos.ProcessosGroup;
import com.github.britooo.looca.api.group.servicos.Servico;
import com.github.britooo.looca.api.group.servicos.ServicosGroup;
import com.github.britooo.looca.api.group.sistema.Sistema;
import java.util.List;
import oshi.hardware.CentralProcessor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author marih
 */
public class Main {

    public static void main(String[] args) {

        Looca looca = new Looca();
        Sistema sistema = looca.getSistema();
       

     
       
        System.out.println(looca.getProcessador().getNome());
        System.out.println(looca.getSistema().getArquitetura());
        System.out.println(looca.getSistema().getFabricante());
        System.out.println(looca.getMemoria().getTotal());
        System.out.println(looca.getGrupoDeDiscos().getTamanhoTotal());
        System.out.println(looca.getSistema().getSistemaOperacional());
        
        

//        DiscosGroup grupoDeDiscos = looca.getGrupoDeDiscos();
//
//        List<Disco> discos = grupoDeDiscos.getDiscos();
//
//        for (Disco disco : discos) {
//            System.out.println(disco);
//        }
//
//        ProcessosGroup grupoDeProcessos = looca.getGrupoDeProcessos();
//
//        List<Processo> processos = grupoDeProcessos.getProcessos();
//
//        for (Processo processo : processos) {
//            System.out.println(processo);
//        }
//
//       

    }
}
