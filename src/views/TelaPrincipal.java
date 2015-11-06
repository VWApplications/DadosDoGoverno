
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
        jLabelFoto = new javax.swing.JLabel();
        jLabelListaComissoes = new javax.swing.JLabel();
        jButtonListaComissoes = new javax.swing.JButton();
        jLabelAjuda = new javax.swing.JLabel();
        jButtonAjuda = new javax.swing.JButton();
        jLabelTelaInternalFrame = new javax.swing.JLabel();
        jLabelJFrame = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuLista = new javax.swing.JMenu();
        jMenuItemListaDeputados = new javax.swing.JMenuItem();
        jMenuItemListaPartidos = new javax.swing.JMenuItem();
        jMenuItemListaComissao = new javax.swing.JMenuItem();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemBemVindo = new javax.swing.JMenuItem();
        jMenuItemAjuda = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
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
        jButtonFechar.setBounds(860, 0, 40, 40);

        jLabelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/brasao.png"))); // NOI18N
        jInternalFrameBemVindo.getContentPane().add(jLabelFoto);
        jLabelFoto.setBounds(250, 10, 400, 440);

        jLabelListaComissoes.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelListaComissoes.setText("Lista de Comissões:");
        jInternalFrameBemVindo.getContentPane().add(jLabelListaComissoes);
        jLabelListaComissoes.setBounds(660, 30, 180, 21);

        jButtonListaComissoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lei.png"))); // NOI18N
        jButtonListaComissoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaComissoesActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonListaComissoes);
        jButtonListaComissoes.setBounds(680, 60, 140, 130);

        jLabelAjuda.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelAjuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAjuda.setText("Ajuda:");
        jInternalFrameBemVindo.getContentPane().add(jLabelAjuda);
        jLabelAjuda.setBounds(670, 240, 150, 21);

        jButtonAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/help.png"))); // NOI18N
        jButtonAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjudaActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonAjuda);
        jButtonAjuda.setBounds(680, 270, 140, 130);

        jLabelTelaInternalFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/telaDeFundo5.jpg"))); // NOI18N
        jInternalFrameBemVindo.getContentPane().add(jLabelTelaInternalFrame);
        jLabelTelaInternalFrame.setBounds(0, 0, 900, 460);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(40, 120, 910, 490);

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

        jMenuItemListaComissao.setText("Lista de comissões");
        jMenuItemListaComissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListaComissaoActionPerformed(evt);
            }
        });
        jMenuLista.add(jMenuItemListaComissao);

        jMenuBar.add(jMenuLista);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemBemVindo.setText("Bem-Vindo");
        jMenuItemBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBemVindoActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemBemVindo);

        jMenuItemAjuda.setText("Ajuda");
        jMenuItemAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAjudaActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemAjuda);

        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItem1);

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButtonListaComissoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaComissoesActionPerformed
        ListaComissao comissao = new ListaComissao();
        comissao.setVisible(true);
    }//GEN-LAST:event_jButtonListaComissoesActionPerformed

    private void jButtonAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjudaActionPerformed
        Ajuda ajudar = new Ajuda();
        ajudar.setVisible(true);
    }//GEN-LAST:event_jButtonAjudaActionPerformed

    private void jMenuItemListaComissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListaComissaoActionPerformed
        ListaComissao comissao = new ListaComissao();
        comissao.setVisible(true);
    }//GEN-LAST:event_jMenuItemListaComissaoActionPerformed

    private void jMenuItemAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAjudaActionPerformed
        Ajuda ajudar = new Ajuda();
        ajudar.setVisible(true);
    }//GEN-LAST:event_jMenuItemAjudaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAjuda;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonListaComissoes;
    private javax.swing.JButton jButtonListaDeDeputados;
    private javax.swing.JButton jButtonListaDePartidos;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabelAjuda;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelJFrame;
    private javax.swing.JLabel jLabelListaComissoes;
    private javax.swing.JLabel jLabelListaDeDeputados;
    private javax.swing.JLabel jLabelListaDePartidos;
    private javax.swing.JLabel jLabelTelaInternalFrame;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAjuda;
    private javax.swing.JMenuItem jMenuItemBemVindo;
    private javax.swing.JMenuItem jMenuItemListaComissao;
    private javax.swing.JMenuItem jMenuItemListaDeputados;
    private javax.swing.JMenuItem jMenuItemListaPartidos;
    private javax.swing.JMenu jMenuLista;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}
