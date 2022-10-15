package com.sptech.cybervision;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscosGroup;
import com.github.britooo.looca.api.group.discos.Volume;
import com.github.britooo.looca.api.group.processos.Processo;
import com.github.britooo.looca.api.group.processos.ProcessosGroup;
import com.github.britooo.looca.api.group.servicos.Servico;
import com.github.britooo.looca.api.group.servicos.ServicosGroup;
import com.github.britooo.looca.api.group.sistema.Sistema;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
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
        
       
//
//        System.out.println(looca.getGrupoDeProcessos().getTotalProcessos());
//        System.out.println(looca.getGrupoDeProcessos().getTotalThreads());
        
        
//        System.out.println(looca.getGrupoDeDiscos().getVolumes());
//        System.out.println(looca.getGrupoDeProcessos().getProcessos());
//        looca.getGrupoDeProcessos().getProcessos().forEach(processo ->{
//            System.out.println(processo.getUsoCpu());
//        
//        });
//           System.out.println(looca.getGrupoDeDiscos().getVolumes());
//           Long totalVolume = Long.MAX_VALUE - Long.MAX_VALUE;
//                   
//         for(Volume volume : looca.getGrupoDeDiscos().getVolumes()){
//             totalVolume += volume.getTotal();
//             
//         
//         }
//         System.out.println(totalVolume);
//         
         Long totalVolumeDisponivel = Long.MAX_VALUE - Long.MAX_VALUE;         
         for(Volume volume : looca.getGrupoDeDiscos().getVolumes()){
             System.out.println(volume.getDisponivel());
        
        }
       
//         
//         Long totalDiscoUsado = totalVolume - totalVolumeDisponivel;
//         
//         System.out.println(totalDiscoUsado);
        
//        for(Processo processo : looca.getGrupoDeProcessos().getProcessos()){
//            System.out.println(processo.getUsoCpu());
//        }

            for(Processo processo : looca.getGrupoDeProcessos().getProcessos()){
               
                
            }



//        System.out.println(looca.getProcessador().getNome());
//        System.out.println(looca.getSistema().getArquitetura());
//        System.out.println(looca.getSistema().getFabricante());
//        System.out.println(looca.getMemoria().getTotal());
//        System.out.println(looca.getGrupoDeDiscos().getTamanhoTotal());
//        System.out.println(looca.getSistema().getSistemaOperacional());
//        System.out.println(looca.getProcessador().getUso());
//        System.out.println(looca.getGrupoDeDiscos().getTamanhoTotal());
//        System.out.println(looca.getGrupoDeDiscos().getDiscos());
//        System.out.println(looca.getMemoria().getEmUso());

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
    }
}
