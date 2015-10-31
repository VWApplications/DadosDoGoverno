
package views;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jLabelListaDeDeputados = new javax.swing.JLabel();
        jButtonListaDeDeputados = new javax.swing.JButton();
        jLabelListaDePartidos = new javax.swing.JLabel();
        jButtonListaDePartidos = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelTelaInternalFrame = new javax.swing.JLabel();
        jLabelJFrame = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuLista = new javax.swing.JMenu();
        jMenuItemListaDeputados = new javax.swing.JMenuItem();
        jMenuItemListaPartidos = new javax.swing.JMenuItem();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemBemVindo = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setTitle("Bem-Vindo");
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jLabelListaDeDeputados.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelListaDeDeputados.setText("Lista de Deputados:");
        jInternalFrameBemVindo.getContentPane().add(jLabelListaDeDeputados);
        jLabelListaDeDeputados.setBounds(50, 30, 180, 21);

        jButtonListaDeDeputados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/politico3.png"))); // NOI18N
        jButtonListaDeDeputados.setToolTipText("Lista de Deputados");
        jButtonListaDeDeputados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaDeDeputadosActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonListaDeDeputados);
        jButtonListaDeDeputados.setBounds(70, 70, 140, 130);

        jLabelListaDePartidos.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelListaDePartidos.setText("Lista de Partidos:");
        jInternalFrameBemVindo.getContentPane().add(jLabelListaDePartidos);
        jLabelListaDePartidos.setBounds(60, 240, 160, 20);

        jButtonListaDePartidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Partidos.png"))); // NOI18N
        jButtonListaDePartidos.setToolTipText("Lista de Partidos");
        jButtonListaDePartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaDePartidosActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonListaDePartidos);
        jButtonListaDePartidos.setBounds(70, 270, 140, 130);

        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fechar.png"))); // NOI18N
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonFechar);
        jButtonFechar.setBounds(830, 0, 40, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/brasao.png"))); // NOI18N
        jInternalFrameBemVindo.getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 10, 490, 440);

        jLabelTelaInternalFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/telaDeFundo5.jpg"))); // NOI18N
        jInternalFrameBemVindo.getContentPane().add(jLabelTelaInternalFrame);
        jLabelTelaInternalFrame.setBounds(0, 0, 870, 460);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(40, 120, 880, 490);

        jLabelJFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/telaDeFundo7.jpg"))); // NOI18N
        jLabelJFrame.setPreferredSize(new java.awt.Dimension(800, 800));
        getContentPane().add(jLabelJFrame);
        jLabelJFrame.setBounds(0, 0, 1000, 630);

        jMenuLista.setText("Lista");

        jMenuItemListaDeputados.setText("Lista de deputados");
        jMenuItemListaDeputados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListaDeputadosActionPerformed(evt);
            }
        });
        jMenuLista.add(jMenuItemListaDeputados);

        jMenuItemListaPartidos.setText("Deputados por partido");
        jMenuItemListaPartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListaPartidosActionPerformed(evt);
            }
        });
        jMenuLista.add(jMenuItemListaPartidos);

        jMenuBar.add(jMenuLista);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemBemVindo.setText("Bem-Vindo");
        jMenuItemBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBemVindoActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemBemVindo);

        jMenuBar.add(jMenuFerramentas);

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBar.add(jMenuSair);

        setJMenuBar(jMenuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        jInternalFrameBemVindo.dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jMenuItemBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBemVindoActionPerformed
        jInternalFrameBemVindo.setVisible(true);
    }//GEN-LAST:event_jMenuItemBemVindoActionPerformed

    private void jButtonListaDeDeputadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaDeDeputadosActionPerformed
        ListaDeputados listaD = new ListaDeputados();
        listaD.setVisible(true);
    }//GEN-LAST:event_jButtonListaDeDeputadosActionPerformed

    private void jButtonListaDePartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaDePartidosActionPerformed
        ListaPartidos listaP = new ListaPartidos();
        listaP.setVisible(true);
    }//GEN-LAST:event_jButtonListaDePartidosActionPerformed

    private void jMenuItemListaDeputadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListaDeputadosActionPerformed
        ListaDeputados listaD = new ListaDeputados();
        listaD.setVisible(true);
    }//GEN-LAST:event_jMenuItemListaDeputadosActionPerformed

    private void jMenuItemListaPartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListaPartidosActionPerformed
        ListaPartidos listaP = new ListaPartidos();
        listaP.setVisible(true);
    }//GEN-LAST:event_jMenuItemListaPartidosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonListaDeDeputados;
    private javax.swing.JButton jButtonListaDePartidos;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelJFrame;
    private javax.swing.JLabel jLabelListaDeDeputados;
    private javax.swing.JLabel jLabelListaDePartidos;
    private javax.swing.JLabel jLabelTelaInternalFrame;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItemBemVindo;
    private javax.swing.JMenuItem jMenuItemListaDeputados;
    private javax.swing.JMenuItem jMenuItemListaPartidos;
    private javax.swing.JMenu jMenuLista;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}
