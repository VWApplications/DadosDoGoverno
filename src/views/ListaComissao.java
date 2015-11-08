
package views;

import javax.swing.JOptionPane;

public class ListaComissao extends javax.swing.JFrame {

    public ListaComissao() {
        initComponents();
        JOptionPane.showMessageDialog(null, "Em construção!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneListaComissao = new javax.swing.JScrollPane();
        jTableListaComissao = new javax.swing.JTable();
        jLabelIMG1 = new javax.swing.JLabel();
        jLabelIMG2 = new javax.swing.JLabel();
        jComboBoxOrdem = new javax.swing.JComboBox();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jLabelTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(838, 540));
        setResizable(false);
        getContentPane().setLayout(null);

        jTableListaComissao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPaneListaComissao.setViewportView(jTableListaComissao);

        getContentPane().add(jScrollPaneListaComissao);
        jScrollPaneListaComissao.setBounds(10, 182, 820, 350);

        jLabelIMG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lei.png"))); // NOI18N
        getContentPane().add(jLabelIMG1);
        jLabelIMG1.setBounds(20, 10, 150, 140);

        jLabelIMG2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lei.png"))); // NOI18N
        jLabelIMG2.setToolTipText("");
        getContentPane().add(jLabelIMG2);
        jLabelIMG2.setBounds(680, 10, 120, 140);

        jComboBoxOrdem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxOrdem);
        jComboBoxOrdem.setBounds(170, 120, 290, 27);
        getContentPane().add(jTextFieldPesquisar);
        jTextFieldPesquisar.setBounds(170, 20, 290, 27);

        jButtonPesquisar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.png"))); // NOI18N
        jButtonPesquisar.setText("PESQUISAR");
        jButtonPesquisar.setToolTipText("pesquisar comissões");
        getContentPane().add(jButtonPesquisar);
        jButtonPesquisar.setBounds(470, 40, 200, 80);

        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fechar.png"))); // NOI18N
        jButtonFechar.setToolTipText("sair");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFechar);
        jButtonFechar.setBounds(802, 0, 40, 40);

        jLabelTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/telaDeFundo2.jpg"))); // NOI18N
        getContentPane().add(jLabelTela);
        jLabelTela.setBounds(0, 0, 840, 540);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JComboBox jComboBoxOrdem;
    private javax.swing.JLabel jLabelIMG1;
    private javax.swing.JLabel jLabelIMG2;
    private javax.swing.JLabel jLabelTela;
    private javax.swing.JScrollPane jScrollPaneListaComissao;
    private javax.swing.JTable jTableListaComissao;
    private javax.swing.JTextField jTextFieldPesquisar;
    // End of variables declaration//GEN-END:variables
}
