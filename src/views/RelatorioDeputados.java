package views;

public class RelatorioDeputados extends javax.swing.JFrame {
    
    String linkFoto, UF, legislatura, dataNascimento, dataMorte, numeroLegislatura;
    
    public RelatorioDeputados(String nome, String partido, String estado, String email, String telefone, String condicao,
                              String sexo, String IDCadastro, String matricula, String nomeParlamentar,
                              String gabinete, String anexo, String linkFoto, String UF, String legislatura,
                              String dataNascimento, String dataMorte, String numeroLegislatura) {
        initComponents();
        jTextFieldNome.setText(nome);
        jTextFieldPartido.setText(partido);
        jTextFieldEstado.setText(estado);
        jTextFieldEmail.setText(email);
        jTextFieldTelefone.setText(telefone);
        jTextFieldCondicao.setText(condicao);
        jTextFieldSexo.setText(sexo);
        jTextFieldID.setText(IDCadastro);
        jTextFieldMatricula.setText(matricula);
        jTextFieldNomeParlamentar.setText(nomeParlamentar);
        jTextFieldGabinete.setText(gabinete);
        jTextFieldAnexo.setText(anexo);
        this.UF = UF;
        this.linkFoto = linkFoto;
        this.legislatura = legislatura;
        this.dataNascimento = dataNascimento;
        this.dataMorte = dataMorte;
        this.numeroLegislatura = numeroLegislatura;
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
        jButtonDetalhes = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
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

        jTextFieldNome.setEditable(false);
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        jPanelRelatorio.add(jTextFieldNome);
        jTextFieldNome.setBounds(100, 50, 300, 27);

        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fechar.png"))); // NOI18N
        jButtonFechar.setToolTipText("Fechar");
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

        jTextFieldPartido.setEditable(false);
        jPanelRelatorio.add(jTextFieldPartido);
        jTextFieldPartido.setBounds(100, 20, 50, 27);

        jLabelEstado.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelEstado.setForeground(java.awt.Color.white);
        jLabelEstado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelEstado.setText("Estado:");
        jPanelRelatorio.add(jLabelEstado);
        jLabelEstado.setBounds(160, 20, 70, 21);

        jTextFieldEstado.setEditable(false);
        jPanelRelatorio.add(jTextFieldEstado);
        jTextFieldEstado.setBounds(240, 20, 50, 27);

        jLabelEmail.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelEmail.setForeground(java.awt.Color.white);
        jLabelEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelEmail.setText("Email:");
        jPanelRelatorio.add(jLabelEmail);
        jLabelEmail.setBounds(20, 80, 70, 21);

        jTextFieldEmail.setEditable(false);
        jPanelRelatorio.add(jTextFieldEmail);
        jTextFieldEmail.setBounds(100, 80, 260, 27);

        jLabelTelefone.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelTelefone.setForeground(java.awt.Color.white);
        jLabelTelefone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTelefone.setText("Telefone:");
        jPanelRelatorio.add(jLabelTelefone);
        jLabelTelefone.setBounds(0, 110, 90, 21);

        jTextFieldTelefone.setEditable(false);
        jPanelRelatorio.add(jTextFieldTelefone);
        jTextFieldTelefone.setBounds(100, 110, 220, 27);

        jLabelCondicao.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelCondicao.setForeground(java.awt.Color.white);
        jLabelCondicao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCondicao.setText("Condição:");
        jPanelRelatorio.add(jLabelCondicao);
        jLabelCondicao.setBounds(-10, 140, 100, 21);

        jTextFieldCondicao.setEditable(false);
        jPanelRelatorio.add(jTextFieldCondicao);
        jTextFieldCondicao.setBounds(100, 140, 220, 27);

        jLabelID.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelID.setForeground(java.awt.Color.white);
        jLabelID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelID.setText("ID:");
        jPanelRelatorio.add(jLabelID);
        jLabelID.setBounds(300, 20, 23, 21);

        jTextFieldID.setEditable(false);
        jPanelRelatorio.add(jTextFieldID);
        jTextFieldID.setBounds(330, 20, 70, 27);

        jLabelMatricula.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelMatricula.setForeground(java.awt.Color.white);
        jLabelMatricula.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelMatricula.setText("Matricula:");
        jPanelRelatorio.add(jLabelMatricula);
        jLabelMatricula.setBounds(-20, 170, 110, 21);

        jTextFieldMatricula.setEditable(false);
        jPanelRelatorio.add(jTextFieldMatricula);
        jTextFieldMatricula.setBounds(100, 170, 220, 27);

        jLabelSexo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelSexo.setForeground(java.awt.Color.white);
        jLabelSexo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelSexo.setText("Sexo:");
        jPanelRelatorio.add(jLabelSexo);
        jLabelSexo.setBounds(30, 200, 60, 21);

        jTextFieldSexo.setEditable(false);
        jPanelRelatorio.add(jTextFieldSexo);
        jTextFieldSexo.setBounds(100, 200, 220, 27);

        jLabelGabinete.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelGabinete.setForeground(java.awt.Color.white);
        jLabelGabinete.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelGabinete.setText("Gabinete:");
        jPanelRelatorio.add(jLabelGabinete);
        jLabelGabinete.setBounds(0, 230, 90, 21);

        jTextFieldGabinete.setEditable(false);
        jPanelRelatorio.add(jTextFieldGabinete);
        jTextFieldGabinete.setBounds(100, 230, 70, 27);

        jLabelNomeParlamentar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelNomeParlamentar.setForeground(java.awt.Color.white);
        jLabelNomeParlamentar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNomeParlamentar.setText("Nome do Parlamentar:");
        jPanelRelatorio.add(jLabelNomeParlamentar);
        jLabelNomeParlamentar.setBounds(20, 270, 250, 21);

        jTextFieldNomeParlamentar.setEditable(false);
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
        jLabelAnexo.setBounds(20, 350, 70, 17);

        jTextFieldAnexo.setEditable(false);
        jTextFieldAnexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnexoActionPerformed(evt);
            }
        });
        jPanelRelatorio.add(jTextFieldAnexo);
        jTextFieldAnexo.setBounds(100, 350, 70, 27);

        jButtonDetalhes.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonDetalhes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chef.png"))); // NOI18N
        jButtonDetalhes.setText("Mais informações");
        jButtonDetalhes.setToolTipText("Mais informações sobre o deputado");
        jButtonDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetalhesActionPerformed(evt);
            }
        });
        jPanelRelatorio.add(jButtonDetalhes);
        jButtonDetalhes.setBounds(20, 400, 250, 100);

        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar1.png"))); // NOI18N
        jButtonVoltar.setToolTipText("Voltar a lista de deputados");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        jPanelRelatorio.add(jButtonVoltar);
        jButtonVoltar.setBounds(662, 0, 40, 40);

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
        
    }//GEN-LAST:event_jTextFieldNomeParlamentarActionPerformed

    private void jButtonDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetalhesActionPerformed
        DetalhesDeputados detalhes = new DetalhesDeputados(linkFoto, UF, legislatura, dataNascimento,
                                                           dataMorte, numeroLegislatura);
        detalhes.setVisible(true);
    }//GEN-LAST:event_jButtonDetalhesActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        ListaDeputados deputado = new ListaDeputados();
        deputado.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jTextFieldAnexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnexoActionPerformed
        
        
    }//GEN-LAST:event_jTextFieldAnexoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDetalhes;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelAnexo;
    private javax.swing.JLabel jLabelCondicao;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEstado;
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
