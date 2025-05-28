package projetobiblio;

import java.sql.SQLException;

public class CadastroFrame extends javax.swing.JFrame {
    
    public CadastroFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputNome = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        inputTelefone = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        inputTipoUsuario = new javax.swing.JTextField();
        labelTipoUsuario = new javax.swing.JLabel();
        cadastrarUsuarioFrame = new javax.swing.JButton();
        textAlert = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeActionPerformed(evt);
            }
        });

        labelNome.setText("Nome");

        inputEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEmailActionPerformed(evt);
            }
        });

        labelEmail.setText("Email");

        inputTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTelefoneActionPerformed(evt);
            }
        });

        labelTelefone.setText("Telefone");

        inputTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTipoUsuarioActionPerformed(evt);
            }
        });

        labelTipoUsuario.setText("Tipo de usuário");

        cadastrarUsuarioFrame.setText("Cadastrar");
        cadastrarUsuarioFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarUsuarioFrameActionPerformed(evt);
            }
        });

        textAlert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textAlert.setText("INFO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textAlert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(inputTipoUsuario)
                        .addComponent(labelTipoUsuario)
                        .addComponent(inputTelefone)
                        .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputEmail)
                        .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelTelefone))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(cadastrarUsuarioFrame)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTipoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cadastrarUsuarioFrame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textAlert)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeActionPerformed

    private void inputEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailActionPerformed

    private void inputTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTelefoneActionPerformed

    private void inputTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTipoUsuarioActionPerformed

    private void cadastrarUsuarioFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarUsuarioFrameActionPerformed
        // TODO add your handling code here:
        
        String nome, email, telefone, tipo_usuario;
        
        nome = inputNome.getText();
        email = inputEmail.getText();
        telefone = inputTelefone.getText();
        tipo_usuario = inputTipoUsuario.getText();
        
        UsuarioDAO usuarioDao = new UsuarioDAO();
        
        Usuario usuario = new Usuario(0, nome, email, telefone, tipo_usuario);
        
//        usuarioDao.criarUsuario(usuario);

        try{
            usuarioDao.criarUsuario(usuario);
            inputNome.setText("");
            inputEmail.setText("");
            inputTelefone.setText("");
            inputTipoUsuario.setText("");
            textAlert.setText("Usuário cadastrado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Deu errado" + e.getMessage());
            textAlert.setText("Cadastro com erro!");
        }

        
    }//GEN-LAST:event_cadastrarUsuarioFrameActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarUsuarioFrame;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputTelefone;
    private javax.swing.JTextField inputTipoUsuario;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTipoUsuario;
    private javax.swing.JLabel textAlert;
    // End of variables declaration//GEN-END:variables
}
