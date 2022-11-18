/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sptech.cybervision.view;

import com.sptech.cybervision.classes.Computador;
import com.sptech.cybervision.conexoes.Conexao;
import com.sptech.cybervision.conexoes.Slack;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.JSONObject;

/**
 *
 * @author bruno
 */
public class Chamados extends javax.swing.JFrame {

    Conexao conexao = new Conexao();
    JSONObject json =  new JSONObject();

    /**
     * Creates new form Chamados
     */
    public Chamados() {
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
        img_background = new javax.swing.JLabel();
        lbl_chamado = new javax.swing.JLabel();
        lbl_ra = new javax.swing.JLabel();
        inputRa = new javax.swing.JTextField();
        lbl_hostname = new javax.swing.JLabel();
        inputHostname = new javax.swing.JTextField();
        btn_finalizar = new javax.swing.JButton();
        lbl_descricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputDescricao = new javax.swing.JTextPane();
        btn_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(799, 600));

        img_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Background.png"))); // NOI18N

        lbl_chamado.setFont(new java.awt.Font("Montserrat SemiBold", 1, 20)); // NOI18N
        lbl_chamado.setForeground(new java.awt.Color(34, 35, 89));
        lbl_chamado.setText("Abertura de chamado");

        lbl_ra.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lbl_ra.setForeground(new java.awt.Color(34, 35, 89));
        lbl_ra.setText("RA do aluno: ");

        inputRa.setFont(new java.awt.Font("Montserrat", 0, 15)); // NOI18N
        inputRa.setCaretColor(new java.awt.Color(254, 254, 254));
        inputRa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputRaActionPerformed(evt);
            }
        });

        lbl_hostname.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lbl_hostname.setForeground(new java.awt.Color(34, 35, 89));
        lbl_hostname.setText("Hostname da máquina:");

        inputHostname.setFont(new java.awt.Font("Montserrat", 0, 15)); // NOI18N
        inputHostname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputHostnameActionPerformed(evt);
            }
        });

        btn_finalizar.setBackground(new java.awt.Color(113, 151, 249));
        btn_finalizar.setFont(new java.awt.Font("Montserrat SemiBold", 0, 15)); // NOI18N
        btn_finalizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_finalizar.setText("Finalizar");
        btn_finalizar.setBorder(null);
        btn_finalizar.setBorderPainted(false);
        btn_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finalizarActionPerformed(evt);
            }
        });

        lbl_descricao.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lbl_descricao.setForeground(new java.awt.Color(34, 35, 89));
        lbl_descricao.setText("Descrição:");

        jScrollPane1.setViewportView(inputDescricao);

        btn_voltar.setBackground(new java.awt.Color(255, 255, 255));
        btn_voltar.setForeground(new java.awt.Color(255, 255, 255));
        btn_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/voltar2.png"))); // NOI18N
        btn_voltar.setBorder(null);
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(lbl_chamado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_hostname)
                            .addComponent(inputHostname, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ra)
                            .addComponent(inputRa, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_descricao)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btn_finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(img_background)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_voltar)
                .addGap(30, 30, 30)
                .addComponent(lbl_chamado)
                .addGap(41, 41, 41)
                .addComponent(lbl_ra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputRa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(lbl_hostname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputHostname, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(lbl_descricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finalizarActionPerformed
        // TODO add your handling code here:
        String raAluno = inputRa.getText();
        String hostNameMaquina = inputHostname.getText();
        String descricaoChamado = inputDescricao.getText();
        String status = "Pendente";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");
        String dataHoraCriacao = dtf.format(LocalDateTime.now());

        List<Map<String, Object>> registroMaquina = conexao.getConnection().queryForList("select * from computador where hostname = ?", hostNameMaquina);

        if (registroMaquina.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hostname inválido!");

        } else if (raAluno.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha seu RA!");

        } else if (descricaoChamado.isEmpty()) {
             JOptionPane.showMessageDialog(this, "Coloque uma descrição do ocorrido!");

        } else {
            Integer fkComputador = Integer.parseInt(registroMaquina.get(0).get("id_computador").toString());
            conexao.getConnection().update(
                    "INSERT INTO chamados (ra_aluno, hostname, descricao_ocorrido,"
                    + " status_chamado, data_hora_criacao, fk_computador) VALUES (?, ?, ?, ?, ?, ?)",
                    raAluno, hostNameMaquina, descricaoChamado, status, dataHoraCriacao, fkComputador);

            JOptionPane.showMessageDialog(this, "Chamado enviado com sucesso!");

            inputRa.setText(null);
            inputHostname.setText(null);
            inputDescricao.setText(null);
            
             json.put("text", "Um chamado acaba de ser aberto "
                     + "referente a máquina com o hostname: " + hostNameMaquina + ":rotating_light: ");
                    try {
                        Slack.enviarMensagem(json);
                    } catch (IOException ex) {
                        Logger.getLogger(Computador.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Computador.class.getName()).log(Level.SEVERE, null, ex);
                    }

        }
    }//GEN-LAST:event_btn_finalizarActionPerformed

    private void inputHostnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHostnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputHostnameActionPerformed

    private void inputRaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputRaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputRaActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        // TODO add your handling code here:
        Logado logado = new Logado();
        this.dispose();
        logado.setVisible(true);
    }//GEN-LAST:event_btn_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(Chamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chamados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_finalizar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel img_background;
    private javax.swing.JTextPane inputDescricao;
    private javax.swing.JTextField inputHostname;
    private javax.swing.JTextField inputRa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_chamado;
    private javax.swing.JLabel lbl_descricao;
    private javax.swing.JLabel lbl_hostname;
    private javax.swing.JLabel lbl_ra;
    // End of variables declaration//GEN-END:variables
}
