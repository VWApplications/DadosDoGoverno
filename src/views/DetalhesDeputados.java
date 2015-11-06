package views;

import java.awt.MediaTracker;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DetalhesDeputados extends javax.swing.JFrame {
    
    String nome, partido, estado, email, telefone, condicao, sexo, IDCadastro, matricula, nomeParlamentar,
           gabinete, anexo, linkFoto, UF, legislatura, dataNascimento, dataMorte, numeroLegislatura;
    
    public DetalhesDeputados(String nome, String partido, String estado, String email, String telefone, String condicao,
                             String sexo, String IDCadastro, String matricula, String nomeParlamentar,
                             String gabinete, String anexo, String linkFoto, String UF, String legislatura,
                             String dataNascimento, String dataMorte, String numeroLegislatura) {
        initComponents();
        jTextFieldUFRepresentacaoAtual.setText(UF);
        jTextFieldSituacaoLegislatura.setText(legislatura);
        jTextFieldDataNascimento.setText(dataNascimento);
        jTextFieldDataFalecimento.setText(dataMorte);
        jTextFieldNumeroLegislatura.setText(numeroLegislatura);
        this.nome = nome;
        this.partido = partido;
        this.estado = estado;
        this.email = email;
        this.telefone = telefone;
        this.condicao = condicao;
        this.sexo = sexo;
        this.IDCadastro = IDCadastro;
        this.matricula = matricula;
        this.nomeParlamentar = nomeParlamentar;
        this.gabinete = gabinete;
        this.anexo = anexo;
        
        //FOTO
        try {
            // inicializa a imagem URL dentro de um objeto ImageIcon
            URL imagem = new URL(linkFoto);
            ImageIcon img = new ImageIcon(imagem);
            // faz o preload da imagem
            while(img.getImageLoadStatus() == MediaTracker.LOADING);
            // injeta o icone no label
            jLabelFOTO.setIcon(img);
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar a imagem do URL" + ex.getMessage());
        }
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
        jLabelFoto = new javax.swing.JLabel();
        jButtonFechar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jLabelFundo = new javax.swing.JLabel();
        jLabelFOTO = new javax.swing.JLabel();

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

        javax.swing.GroupLayout jPanelFotoLayout = new javax.swing.GroupLayout(jPanelFoto);
        jPanelFoto.setLayout(jPanelFotoLayout);
        jPanelFotoLayout.setHorizontalGroup(
            jPanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
        );
        jPanelFotoLayout.setVerticalGroup(
            jPanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );

        jPanelDetalhes.add(jPanelFoto);
        jPanelFoto.setBounds(270, 220, 160, 150);

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

        jLabelFOTO.setToolTipText("Foto do deputado");
        jPanelDetalhes.add(jLabelFOTO);
        jLabelFOTO.setBounds(270, 220, 161, 146);

        getContentPane().add(jPanelDetalhes);
        jPanelDetalhes.setBounds(0, 0, 740, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        RelatorioDeputados relatorio = new RelatorioDeputados(nome, partido, estado, email, telefone, condicao,
                                                              sexo, IDCadastro, matricula, nomeParlamentar,
                                                              gabinete, anexo, linkFoto, UF, legislatura,
                                                              dataNascimento, dataMorte, numeroLegislatura);
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
