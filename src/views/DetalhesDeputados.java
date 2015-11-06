package views;

import models.DadosAbertos;
import models.ModeloTabela;

public class DetalhesDeputados extends javax.swing.JFrame {

    ModeloTabela tabela = DadosAbertos.getTabela();
    
    public DetalhesDeputados() {
        initComponents();
        //Object detalhe = tabela.getValueAt();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDetalhes = new javax.swing.JPanel();
        jLabelUFRepresentacaoAtual = new javax.swing.JLabel();
        jTextFieldUFRepresentacaoAtual = new javax.swing.JTextField();
        jLabelSituaçaoLegislatura = new javax.swing.JLabel();
        jTextFieldSituacaoLegislatura = new javax.swing.JTextField();
        jLabelDataNascimento = new javax.swing.JLabel();
        jTextFieldDataNascimento = new javax.swing.JTextField();
        jLabelDataFalecimento = new javax.swing.JLabel();
        jTextFieldDataFalecimento = new javax.swing.JTextField();
        jLabelNumeroLegislatura = new javax.swing.JLabel();
        jTextFieldNumeroLegislatura = new javax.swing.JTextField();
        jPanelFoto = new javax.swing.JPanel();
        jLabelFOTO = new javax.swing.JLabel();
        jLabelFoto = new javax.swing.JLabel();
        jButtonFechar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(740, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanelDetalhes.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanelDetalhes.setName(""); // NOI18N
        jPanelDetalhes.setLayout(null);

        jLabelUFRepresentacaoAtual.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelUFRepresentacaoAtual.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelUFRepresentacaoAtual.setText("UF de representação atual:");
        jPanelDetalhes.add(jLabelUFRepresentacaoAtual);
        jLabelUFRepresentacaoAtual.setBounds(10, 10, 240, 21);

        jTextFieldUFRepresentacaoAtual.setEditable(false);
        jPanelDetalhes.add(jTextFieldUFRepresentacaoAtual);
        jTextFieldUFRepresentacaoAtual.setBounds(270, 10, 60, 27);

        jLabelSituaçaoLegislatura.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelSituaçaoLegislatura.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelSituaçaoLegislatura.setText("Situação na legislatura atual:");
        jPanelDetalhes.add(jLabelSituaçaoLegislatura);
        jLabelSituaçaoLegislatura.setBounds(-10, 40, 260, 21);

        jTextFieldSituacaoLegislatura.setEditable(false);
        jPanelDetalhes.add(jTextFieldSituacaoLegislatura);
        jTextFieldSituacaoLegislatura.setBounds(270, 40, 230, 27);

        jLabelDataNascimento.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelDataNascimento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDataNascimento.setText("Data de nascimento:");
        jPanelDetalhes.add(jLabelDataNascimento);
        jLabelDataNascimento.setBounds(10, 70, 240, 21);

        jTextFieldDataNascimento.setEditable(false);
        jPanelDetalhes.add(jTextFieldDataNascimento);
        jTextFieldDataNascimento.setBounds(270, 70, 230, 27);

        jLabelDataFalecimento.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelDataFalecimento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDataFalecimento.setText("Data de falecimento:");
        jPanelDetalhes.add(jLabelDataFalecimento);
        jLabelDataFalecimento.setBounds(10, 100, 240, 21);

        jTextFieldDataFalecimento.setEditable(false);
        jPanelDetalhes.add(jTextFieldDataFalecimento);
        jTextFieldDataFalecimento.setBounds(270, 100, 230, 27);

        jLabelNumeroLegislatura.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelNumeroLegislatura.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNumeroLegislatura.setText("Número de legislatura:");
        jPanelDetalhes.add(jLabelNumeroLegislatura);
        jLabelNumeroLegislatura.setBounds(10, 130, 240, 21);

        jTextFieldNumeroLegislatura.setEditable(false);
        jPanelDetalhes.add(jTextFieldNumeroLegislatura);
        jTextFieldNumeroLegislatura.setBounds(270, 130, 60, 27);

        jPanelFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelFOTO.setToolTipText("Foto do deputado");

        javax.swing.GroupLayout jPanelFotoLayout = new javax.swing.GroupLayout(jPanelFoto);
        jPanelFoto.setLayout(jPanelFotoLayout);
        jPanelFotoLayout.setHorizontalGroup(
            jPanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelFOTO, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );
        jPanelFotoLayout.setVerticalGroup(
            jPanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelFOTO, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
        );

        jPanelDetalhes.add(jPanelFoto);
        jPanelFoto.setBounds(160, 200, 400, 250);

        jLabelFoto.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabelFoto.setText("FOTO");
        jPanelDetalhes.add(jLabelFoto);
        jLabelFoto.setBounds(300, 160, 110, 40);

        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fechar.png"))); // NOI18N
        jButtonFechar.setToolTipText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        jPanelDetalhes.add(jButtonFechar);
        jButtonFechar.setBounds(700, 0, 40, 40);

        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar1.png"))); // NOI18N
        jButtonVoltar.setToolTipText("Voltar ao relatorio");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        jPanelDetalhes.add(jButtonVoltar);
        jButtonVoltar.setBounds(660, 0, 40, 40);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/telaDeFundo5.jpg"))); // NOI18N
        jPanelDetalhes.add(jLabelFundo);
        jLabelFundo.setBounds(0, 0, 740, 500);

        getContentPane().add(jPanelDetalhes);
        jPanelDetalhes.setBounds(0, 0, 740, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        RelatorioDeputados relatorio = new RelatorioDeputados();
        relatorio.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelDataFalecimento;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelFOTO;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelNumeroLegislatura;
    private javax.swing.JLabel jLabelSituaçaoLegislatura;
    private javax.swing.JLabel jLabelUFRepresentacaoAtual;
    private javax.swing.JPanel jPanelDetalhes;
    private javax.swing.JPanel jPanelFoto;
    private javax.swing.JTextField jTextFieldDataFalecimento;
    private javax.swing.JTextField jTextFieldDataNascimento;
    private javax.swing.JTextField jTextFieldNumeroLegislatura;
    private javax.swing.JTextField jTextFieldSituacaoLegislatura;
    private javax.swing.JTextField jTextFieldUFRepresentacaoAtual;
    // End of variables declaration//GEN-END:variables
}
