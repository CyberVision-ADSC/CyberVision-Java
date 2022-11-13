/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sptech.cybervision.view;

import com.sptech.cybervision.classes.Faculdade;
import com.sptech.cybervision.classes.Usuario;
import com.sptech.cybervision.conexoes.Conexao;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import org.springframework.dao.EmptyResultDataAccessException;

/**
 *
 * @author bruno
 */
public class Login extends javax.swing.JFrame {

    Conexao conexao = new Conexao();
    AssociarMaquina associar = new AssociarMaquina();

    /**
     * Creates new form Login
     */
    public Login() {
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

        jLabel1 = new javax.swing.JLabel();
        lbl_login = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        img_logo = new javax.swing.JLabel();
        img_background = new javax.swing.JLabel();
        lbl_login1 = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        lbl_senha = new javax.swing.JLabel();
        btn_entrar = new javax.swing.JButton();
        inputSenha = new javax.swing.JPasswordField();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_cybervision.png"))); // NOI18N

        lbl_login.setFont(new java.awt.Font("Montserrat SemiBold", 1, 20)); // NOI18N
        lbl_login.setForeground(new java.awt.Color(34, 35, 89));
        lbl_login.setText("Entre na sua conta");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(799, 600));

        img_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_cybervision.png"))); // NOI18N

        img_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Background.png"))); // NOI18N

        lbl_login1.setFont(new java.awt.Font("Montserrat SemiBold", 1, 20)); // NOI18N
        lbl_login1.setForeground(new java.awt.Color(34, 35, 89));
        lbl_login1.setText("Entre na sua conta");

        lbl_email.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(34, 35, 89));
        lbl_email.setText("Email:");

        inputEmail.setFont(new java.awt.Font("Montserrat", 0, 15)); // NOI18N
        inputEmail.setCaretColor(new java.awt.Color(254, 254, 254));
        inputEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEmailActionPerformed(evt);
            }
        });

        lbl_senha.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lbl_senha.setForeground(new java.awt.Color(34, 35, 89));
        lbl_senha.setText("Senha:");

        btn_entrar.setBackground(new java.awt.Color(113, 151, 249));
        btn_entrar.setFont(new java.awt.Font("Montserrat SemiBold", 0, 15)); // NOI18N
        btn_entrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_entrar.setText("Entrar");
        btn_entrar.setBorder(null);
        btn_entrar.setBorderPainted(false);
        btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(img_logo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lbl_login1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(lbl_email)
                            .addComponent(lbl_senha)
                            .addComponent(inputSenha)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btn_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84)
                .addComponent(img_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(img_logo)
                .addGap(46, 46, 46)
                .addComponent(lbl_login1)
                .addGap(34, 34, 34)
                .addComponent(lbl_email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(lbl_senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btn_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void inputEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailActionPerformed

    private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed
        // TODO add your handling code here:

        String emailDigitado = inputEmail.getText();
        String senhaDigitada = new String(inputSenha.getPassword());

        try {
            Map<String, Object> registro = conexao.getConnection().queryForMap("select * from usuario where email = ? and senha = ?", emailDigitado, senhaDigitada);

            // Instânciando usuário que logou
            List<Map<String, Object>> listaUsuario = conexao.getConnection().queryForList("select * from usuario where email = ?", emailDigitado);
            String nomeUsuario = listaUsuario.get(0).get("nome").toString();
            String nivelAcesso = listaUsuario.get(0).get("tipo_usuario").toString();
            Integer fkFaculdade = Integer.parseInt(listaUsuario.get(0).get("fk_faculdade").toString());

            // Instânciando faculdade que o usuário pertence
            List<Map<String, Object>> listaFaculdade = conexao.getConnection().queryForList("select * from faculdade where id_faculdade = ?", fkFaculdade);
            String nomeFantasia = listaFaculdade.get(0).get("nome_fantasia").toString();
            String razaoSocial = listaFaculdade.get(0).get("razao_social").toString();
            String cnpj = listaFaculdade.get(0).get("cnpj").toString();
            String cep = listaFaculdade.get(0).get("cep").toString();
            Integer numero = Integer.parseInt(listaFaculdade.get(0).get("numero").toString());

            // Objeto da faculdade
            Faculdade faculdade = new Faculdade(nomeFantasia, razaoSocial, cnpj, cep, numero);

            // Objeto do usuário
            Usuario usuario = new Usuario(nomeUsuario, emailDigitado, senhaDigitada, nivelAcesso);

            // Adicionando usuário a lista de usuários dentro da faculdade
            faculdade.adicionarUsuario(usuario);
            
            // Printando faculdade e usuário
            System.out.println(faculdade);
            System.out.println(usuario);
            

            // Trocando de tela
            this.dispose();
            associar.setVisible(true);

        } catch (EmptyResultDataAccessException e) {
            JOptionPane.showMessageDialog(this, "Email ou senha incorretos!");
            e.printStackTrace();
        }

    }//GEN-LAST:event_btn_entrarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_entrar;
    private javax.swing.JLabel img_background;
    private javax.swing.JLabel img_logo;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JPasswordField inputSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JLabel lbl_login1;
    private javax.swing.JLabel lbl_senha;
    // End of variables declaration//GEN-END:variables
}
