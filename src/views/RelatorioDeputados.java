package views;

public class RelatorioDeputados extends javax.swing.JFrame {

    public RelatorioDeputados() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelRelatorio = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonFechar = new javax.swing.JButton();
        jLabelPartido = new javax.swing.JLabel();
        jTextFieldPartido = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        jTextFieldEstado = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabelCondicao = new javax.swing.JLabel();
        jTextFieldCondicao = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelMatricula = new javax.swing.JLabel();
        jTextFieldMatricula = new javax.swing.JTextField();
        jLabelSexo = new javax.swing.JLabel();
        jTextFieldSexo = new javax.swing.JTextField();
        jLabelGabinete = new javax.swing.JLabel();
        jTextFieldGabinete = new javax.swing.JTextField();
        jLabelNomeParlamentar = new javax.swing.JLabel();
        jTextFieldNomeParlamentar = new javax.swing.JTextField();
        jLabelAnexo = new javax.swing.JLabel();
        jTextFieldAnexo = new javax.swing.JTextField();
        jLabelFoto = new javax.swing.JLabel();
        jLabelFotoView = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setPreferredSize(new java.awt.Dimension(740, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(765, 500));
        getContentPane().setLayout(null);

        jPanelRelatorio.setLayout(null);

        jLabelNome.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelNome.setForeground(java.awt.Color.white);
        jLabelNome.setText("Nome:");
        jPanelRelatorio.add(jLabelNome);
        jLabelNome.setBounds(30, 50, 70, 21);

        jTextFieldNome.setEnabled(false);
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        jPanelRelatorio.add(jTextFieldNome);
        jTextFieldNome.setBounds(100, 50, 300, 27);

        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fechar.png"))); // NOI18N
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        jPanelRelatorio.add(jButtonFechar);
        jButtonFechar.setBounds(700, 0, 40, 40);

        jLabelPartido.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelPartido.setForeground(java.awt.Color.white);
        jLabelPartido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPartido.setText("Partido:");
        jPanelRelatorio.add(jLabelPartido);
        jLabelPartido.setBounds(20, 20, 70, 21);

        jTextFieldPartido.setEnabled(false);
        jPanelRelatorio.add(jTextFieldPartido);
        jTextFieldPartido.setBounds(100, 20, 50, 27);

        jLabelEstado.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelEstado.setForeground(java.awt.Color.white);
        jLabelEstado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelEstado.setText("Estado:");
        jPanelRelatorio.add(jLabelEstado);
        jLabelEstado.setBounds(160, 20, 70, 21);

        jTextFieldEstado.setEnabled(false);
        jPanelRelatorio.add(jTextFieldEstado);
        jTextFieldEstado.setBounds(240, 20, 50, 27);

        jLabelEmail.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelEmail.setForeground(java.awt.Color.white);
        jLabelEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelEmail.setText("Email:");
        jPanelRelatorio.add(jLabelEmail);
        jLabelEmail.setBounds(20, 80, 70, 21);

        jTextFieldEmail.setEnabled(false);
        jPanelRelatorio.add(jTextFieldEmail);
        jTextFieldEmail.setBounds(100, 80, 260, 27);

        jLabelTelefone.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelTelefone.setForeground(java.awt.Color.white);
        jLabelTelefone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTelefone.setText("Telefone:");
        jPanelRelatorio.add(jLabelTelefone);
        jLabelTelefone.setBounds(0, 110, 90, 21);

        jTextFieldTelefone.setEnabled(false);
        jPanelRelatorio.add(jTextFieldTelefone);
        jTextFieldTelefone.setBounds(100, 110, 220, 27);

        jLabelCondicao.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelCondicao.setForeground(java.awt.Color.white);
        jLabelCondicao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCondicao.setText("Condição:");
        jPanelRelatorio.add(jLabelCondicao);
        jLabelCondicao.setBounds(-10, 140, 100, 21);

        jTextFieldCondicao.setEnabled(false);
        jPanelRelatorio.add(jTextFieldCondicao);
        jTextFieldCondicao.setBounds(100, 140, 220, 27);

        jLabelID.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelID.setForeground(java.awt.Color.white);
        jLabelID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelID.setText("ID:");
        jPanelRelatorio.add(jLabelID);
        jLabelID.setBounds(300, 20, 23, 21);

        jTextFieldID.setEnabled(false);
        jPanelRelatorio.add(jTextFieldID);
        jTextFieldID.setBounds(330, 20, 70, 27);

        jLabelMatricula.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelMatricula.setForeground(java.awt.Color.white);
        jLabelMatricula.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelMatricula.setText("Matricula:");
        jPanelRelatorio.add(jLabelMatricula);
        jLabelMatricula.setBounds(-20, 170, 110, 21);

        jTextFieldMatricula.setEnabled(false);
        jPanelRelatorio.add(jTextFieldMatricula);
        jTextFieldMatricula.setBounds(100, 170, 220, 27);

        jLabelSexo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelSexo.setForeground(java.awt.Color.white);
        jLabelSexo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelSexo.setText("Sexo:");
        jPanelRelatorio.add(jLabelSexo);
        jLabelSexo.setBounds(30, 200, 60, 21);

        jTextFieldSexo.setEnabled(false);
        jPanelRelatorio.add(jTextFieldSexo);
        jTextFieldSexo.setBounds(100, 200, 220, 27);

        jLabelGabinete.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelGabinete.setForeground(java.awt.Color.white);
        jLabelGabinete.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelGabinete.setText("Gabinete:");
        jPanelRelatorio.add(jLabelGabinete);
        jLabelGabinete.setBounds(0, 230, 90, 21);

        jTextFieldGabinete.setEnabled(false);
        jPanelRelatorio.add(jTextFieldGabinete);
        jTextFieldGabinete.setBounds(100, 230, 220, 27);

        jLabelNomeParlamentar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelNomeParlamentar.setForeground(java.awt.Color.white);
        jLabelNomeParlamentar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNomeParlamentar.setText("Nome do Parlamentar:");
        jPanelRelatorio.add(jLabelNomeParlamentar);
        jLabelNomeParlamentar.setBounds(20, 270, 250, 21);

        jTextFieldNomeParlamentar.setEnabled(false);
        jTextFieldNomeParlamentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeParlamentarActionPerformed(evt);
            }
        });
        jPanelRelatorio.add(jTextFieldNomeParlamentar);
        jTextFieldNomeParlamentar.setBounds(20, 300, 250, 27);

        jLabelAnexo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelAnexo.setForeground(java.awt.Color.white);
        jLabelAnexo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAnexo.setText("Anexo:");
        jPanelRelatorio.add(jLabelAnexo);
        jLabelAnexo.setBounds(20, 350, 180, 17);

        jTextFieldAnexo.setEnabled(false);
        jPanelRelatorio.add(jTextFieldAnexo);
        jTextFieldAnexo.setBounds(20, 380, 180, 27);

        jLabelFoto.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabelFoto.setForeground(java.awt.Color.white);
        jLabelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFoto.setText("Foto:");
        jPanelRelatorio.add(jLabelFoto);
        jLabelFoto.setBounds(590, 290, 110, 50);

        jLabelFotoView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/UnB.png"))); // NOI18N
        jPanelRelatorio.add(jLabelFotoView);
        jLabelFotoView.setBounds(570, 340, 160, 170);

        jButton1.setText("Mais informações");
        jPanelRelatorio.add(jButton1);
        jButton1.setBounds(20, 420, 180, 70);

        jLabelFundo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelFundo.setForeground(java.awt.Color.white);
        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/telaDeFundo4.jpg"))); // NOI18N
        jPanelRelatorio.add(jLabelFundo);
        jLabelFundo.setBounds(0, 0, 740, 530);

        getContentPane().add(jPanelRelatorio);
        jPanelRelatorio.setBounds(0, 0, 740, 530);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jTextFieldNomeParlamentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeParlamentarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeParlamentarActionPerformed

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
            java.util.logging.Logger.getLogger(RelatorioDeputados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioDeputados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioDeputados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioDeputados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioDeputados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JLabel jLabelAnexo;
    private javax.swing.JLabel jLabelCondicao;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelFotoView;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelGabinete;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNomeParlamentar;
    private javax.swing.JLabel jLabelPartido;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanelRelatorio;
    private javax.swing.JTextField jTextFieldAnexo;
    private javax.swing.JTextField jTextFieldCondicao;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldGabinete;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNomeParlamentar;
    private javax.swing.JTextField jTextFieldPartido;
    private javax.swing.JTextField jTextFieldSexo;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
