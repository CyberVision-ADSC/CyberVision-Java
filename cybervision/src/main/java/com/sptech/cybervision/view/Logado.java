/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sptech.cybervision.view;

import com.sptech.cybervision.view.Chamados;

/**
 *
 * @author bruno
 */
public class Logado extends javax.swing.JFrame {
    Chamados chamados = new Chamados();

    /**
     * Creates new form Logado
     */
    public Logado() {
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
        lbl_obrigado = new javax.swing.JLabel();
        lbl_frase1 = new javax.swing.JLabel();
        btn_ajuda = new javax.swing.JButton();
        lbl_frase2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(799, 600));

        img_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_cybervision.png"))); // NOI18N

        img_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Background.png"))); // NOI18N

        lbl_obrigado.setFont(new java.awt.Font("Montserrat SemiBold", 1, 20)); // NOI18N
        lbl_obrigado.setForeground(new java.awt.Color(34, 35, 89));
        lbl_obrigado.setText("Obrigado por logar");

        lbl_frase1.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lbl_frase1.setForeground(new java.awt.Color(34, 35, 89));
        lbl_frase1.setText("Estamos trabalhando para te");

        btn_ajuda.setBackground(new java.awt.Color(113, 151, 249));
        btn_ajuda.setFont(new java.awt.Font("Montserrat SemiBold", 0, 15)); // NOI18N
        btn_ajuda.setForeground(new java.awt.Color(255, 255, 255));
        btn_ajuda.setText("Precisa de ajuda?");
        btn_ajuda.setBorder(null);
        btn_ajuda.setBorderPainted(false);
        btn_ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ajudaActionPerformed(evt);
            }
        });

        lbl_frase2.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lbl_frase2.setForeground(new java.awt.Color(34, 35, 89));
        lbl_frase2.setText("proporcionar uma melhor experi??ncia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(img_logo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_frase1)
                            .addComponent(lbl_obrigado)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(lbl_frase2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btn_ajuda, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75)
                .addComponent(img_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(img_logo)
                .addGap(40, 40, 40)
                .addComponent(lbl_obrigado)
                .addGap(46, 46, 46)
                .addComponent(lbl_frase1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_frase2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btn_ajuda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(img_background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ajudaActionPerformed
        // TODO add your handling code here:
            this.dispose();
            chamados.setVisible(true);
    }//GEN-LAST:event_btn_ajudaActionPerformed

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
            java.util.logging.Logger.getLogger(Logado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ajuda;
    private javax.swing.JLabel img_background;
    private javax.swing.JLabel img_logo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_frase1;
    private javax.swing.JLabel lbl_frase2;
    private javax.swing.JLabel lbl_obrigado;
    // End of variables declaration//GEN-END:variables
}
