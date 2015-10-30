package views;

import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JButtonSair = new javax.swing.JButton();
        JButtonAcessar = new javax.swing.JButton();
        jLabelSenha = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabelUnB = new javax.swing.JLabel();
        jLabelBrasil = new javax.swing.JLabel();
        jLabelBrasil2 = new javax.swing.JLabel();
        JLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(640, 370));
        setResizable(false);
        setSize(new java.awt.Dimension(640, 370));
        getContentPane().setLayout(null);

        JButtonSair.setText("Sair");
        JButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonSair);
        JButtonSair.setBounds(150, 200, 100, 40);

        JButtonAcessar.setText("Acessar");
        JButtonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonAcessar);
        JButtonAcessar.setBounds(30, 200, 100, 40);

        jLabelSenha.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelSenha.setForeground(java.awt.Color.white);
        jLabelSenha.setText("Senha:");
        jLabelSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(30, 130, 60, 40);

        jLabelUsuario.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelUsuario.setForeground(java.awt.Color.white);
        jLabelUsuario.setText("Usuario:");
        jLabelUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(20, 80, 71, 40);
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(100, 90, 160, 27);
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(100, 140, 160, 27);

        jLabelUnB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/UnB.png"))); // NOI18N
        getContentPane().add(jLabelUnB);
        jLabelUnB.setBounds(490, 10, 140, 130);

        jLabelBrasil.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabelBrasil.setForeground(java.awt.Color.yellow);
        jLabelBrasil.setText("BRASIL");
        getContentPane().add(jLabelBrasil);
        jLabelBrasil.setBounds(90, 20, 180, 50);

        jLabelBrasil2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/brasil2.png"))); // NOI18N
        getContentPane().add(jLabelBrasil2);
        jLabelBrasil2.setBounds(30, 30, 50, 40);

        JLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/telaDeFundo1.jpg"))); // NOI18N
        getContentPane().add(JLabelFundo);
        JLabelFundo.setBounds(0, 0, 670, 370);
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JButtonSairActionPerformed

    private void JButtonAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAcessarActionPerformed
        if(jTextFieldUsuario.getText().equals("admin") && jPasswordFieldSenha.getText().equals("1234")){
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Senha ou Usuário invalidos!");
        }
    }//GEN-LAST:event_JButtonAcessarActionPerformed


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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAcessar;
    private javax.swing.JButton JButtonSair;
    private javax.swing.JLabel JLabelFundo;
    private javax.swing.JLabel jLabelBrasil;
    private javax.swing.JLabel jLabelBrasil2;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUnB;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
