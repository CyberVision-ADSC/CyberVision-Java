/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sptech.cybervision;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Volume;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import org.springframework.dao.EmptyResultDataAccessException;

/**
 *
 * @author bruno
 */
public class AssociarMaquina extends javax.swing.JFrame {

    Looca looca = new Looca();
    Conexao conexao = new Conexao();
    Logado logado = new Logado();

    /**
     * Creates new form Logado
     */
    public AssociarMaquina() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        img_logo = new javax.swing.JLabel();
        img_background = new javax.swing.JLabel();
        lbl_associe = new javax.swing.JLabel();
        lbl_digite = new javax.swing.JLabel();
        inputHostName = new javax.swing.JTextField();
        btn_associar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(799, 600));

        img_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_cybervision.png"))); // NOI18N

        img_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Background.png"))); // NOI18N

        lbl_associe.setFont(new java.awt.Font("Montserrat SemiBold", 1, 20)); // NOI18N
        lbl_associe.setForeground(new java.awt.Color(34, 35, 89));
        lbl_associe.setText("Associe sua máquina");

        lbl_digite.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lbl_digite.setForeground(new java.awt.Color(34, 35, 89));
        lbl_digite.setText("Digite o código que está sendo exibido na web");

        inputHostName.setFont(new java.awt.Font("Montserrat", 0, 15)); // NOI18N
        inputHostName.setCaretColor(new java.awt.Color(254, 254, 254));
        inputHostName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputHostNameActionPerformed(evt);
            }
        });

        btn_associar.setBackground(new java.awt.Color(113, 151, 249));
        btn_associar.setFont(new java.awt.Font("Montserrat SemiBold", 0, 15)); // NOI18N
        btn_associar.setForeground(new java.awt.Color(255, 255, 255));
        btn_associar.setText("Associar");
        btn_associar.setBorder(null);
        btn_associar.setBorderPainted(false);
        btn_associar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_associarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(inputHostName)
                            .addComponent(lbl_digite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_associe)
                        .addGap(93, 93, 93))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(btn_associar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(img_logo)))
                        .addGap(101, 101, 101)))
                .addComponent(img_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(img_logo)
                .addGap(41, 41, 41)
                .addComponent(lbl_associe)
                .addGap(40, 40, 40)
                .addComponent(lbl_digite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputHostName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btn_associar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(img_background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputHostNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHostNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputHostNameActionPerformed

    private void btn_associarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_associarActionPerformed
        // TODO add your handling code here:

        String hostName = inputHostName.getText();
        String nomeProcessador = looca.getProcessador().getNome();
        Integer arquitetura = looca.getSistema().getArquitetura();
        String fabricante = looca.getSistema().getFabricante();
        Long memoriaRam = looca.getMemoria().getTotal() / 1000000;
        Long tamanhoDisco = looca.getGrupoDeDiscos().getTamanhoTotal() / 1000000;
        String sistemaOperacional = looca.getSistema().getSistemaOperacional();

        try {
            Map<String, Object> registroHost = conexao.jdbcTemplate.queryForMap(
                    "select * from computador WHERE hostname = ?", hostName);
            
            Computador computador = new Computador(hostName, nomeProcessador, arquitetura, fabricante, memoriaRam, tamanhoDisco, sistemaOperacional, true);

            conexao.jdbcTemplate.update(
                    "UPDATE computador SET processador = ?, arquitetura = ?, "
                    + "fabricante = ?, ram = ?, disco = ?, sistema_operacional = ?, "
                    + "ativo = ? WHERE hostname = ?",
                    nomeProcessador, arquitetura, fabricante, memoriaRam,
                    tamanhoDisco, sistemaOperacional, true, hostName);

            new Timer().scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {

                    Long totalDisco = Long.MAX_VALUE - Long.MAX_VALUE;
                    Long totalDiscoDisponivel = Long.MAX_VALUE - Long.MAX_VALUE;

                    for (Volume volume : looca.getGrupoDeDiscos().getVolumes()) {
                        totalDisco += volume.getTotal();
                    }

                    for (Volume volume : looca.getGrupoDeDiscos().getVolumes()) {
                        totalDiscoDisponivel += volume.getDisponivel();
                    }

                    Double usoCpu = looca.getProcessador().getUso();
                    Long usoDisco = (totalDisco - totalDiscoDisponivel) / 1000000;
                    Long usoRam = looca.getMemoria().getEmUso() / 1000000;
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    String dataHora = dtf.format(LocalDateTime.now());

                    int rowInsertedRelatorio = conexao.jdbcTemplate.update(
                            "INSERT INTO relatorio (uso_cpu, uso_disco, uso_ram, problema_cpu,"
                            + " problema_disco, problema_memoria, problema_fisico, data_hora, fk_computador,"
                            + " fk_sala) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                            usoCpu, usoDisco, usoRam, false, false, false, false,
                            dataHora, null, null);

                    if (rowInsertedRelatorio > 0) {
                        System.out.println("relatorio inserido com sucesso");
                    }

                    for (com.github.britooo.looca.api.group.processos.Processo processo : looca.getGrupoDeProcessos().getProcessos()) {
                        Integer pidProcesso = processo.getPid();
                        String nomeProcesso = processo.getNome();
                        Double usoCpuProcesso = processo.getUsoCpu();
                        Double usoMemoriaProcesso = processo.getUsoMemoria();

                        int rowsInsertedProcess = conexao.jdbcTemplate.update(
                                "INSERT INTO processo (pid, nome, uso_cpu, uso_memoria, fk_computador)"
                                + " VALUES (?, ?, ?, ?, ?)",
                                pidProcesso, nomeProcesso, usoCpuProcesso, usoMemoriaProcesso, null);

                        if (rowsInsertedProcess > 0) {
                            System.out.println("processo inserido com sucesso");
                        }

                    }
                }
            }, 0, 5000);

            this.dispose();
            logado.setVisible(true);

        } catch (EmptyResultDataAccessException e) {
            JOptionPane.showMessageDialog(this, "Hostname não encontrado!");

        }


    }//GEN-LAST:event_btn_associarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AssociarMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssociarMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssociarMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssociarMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssociarMaquina().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_associar;
    private javax.swing.JLabel img_background;
    private javax.swing.JLabel img_logo;
    private javax.swing.JTextField inputHostName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_associe;
    private javax.swing.JLabel lbl_digite;
    // End of variables declaration//GEN-END:variables
}
