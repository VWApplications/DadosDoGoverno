package views;

import javax.swing.JOptionPane;

public class Ajuda extends javax.swing.JFrame {

    public Ajuda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAjuda = new javax.swing.JLabel();
        jButtonFechar = new javax.swing.JButton();
        jLabelLogin = new javax.swing.JLabel();
        jScrollPaneLogin = new javax.swing.JScrollPane();
        jTextAreaLogin = new javax.swing.JTextArea();
        jLabelTelaPrincipal = new javax.swing.JLabel();
        jScrollPaneTelaPrincipal = new javax.swing.JScrollPane();
        jTextAreaTelaPrincipal = new javax.swing.JTextArea();
        jLabelRelatorioEDetalhes = new javax.swing.JLabel();
        jScrollPaneRelatorioEDetalhes = new javax.swing.JScrollPane();
        jTextAreaRelatorioEDetalhes = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelAjuda.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelAjuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAjuda.setText("AJUDA:");

        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fechar.png"))); // NOI18N
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jLabelLogin.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelLogin.setForeground(java.awt.Color.black);
        jLabelLogin.setText("Tela Login:");

        jTextAreaLogin.setEditable(false);
        jTextAreaLogin.setColumns(20);
        jTextAreaLogin.setRows(5);
        jTextAreaLogin.setText("Login: admin\nSenha: 1234\nAo acessar irá aparecer uma barra de progresso onde irá pegar os dados abertos do governo, \ndemora em torno de 5 minutos.\n");
        jScrollPaneLogin.setViewportView(jTextAreaLogin);

        jLabelTelaPrincipal.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelTelaPrincipal.setForeground(java.awt.Color.black);
        jLabelTelaPrincipal.setText("Tela Principal:");

        jTextAreaTelaPrincipal.setEditable(false);
        jTextAreaTelaPrincipal.setColumns(20);
        jTextAreaTelaPrincipal.setRows(5);
        jTextAreaTelaPrincipal.setText("Lista Deputado:\n            Haverá uma tabela com todos os dados dos deputados.\n            Se quiser colocar a tabela em ordem crescente ou decrescente é só clicar nas colunas da tabela.\n            Se quiser ver o relatorio do deputado, clique no deputado e aperte no botão relatorio.\n\nLista Partidos:\n            Haverá uma tabela com todos os dados dos partidos.\n            Se quiser colocar em ordem crescente ou decrescente é só clicar nas colunas da tabela.\n\nLista Comissões:\n           Em construção.\n\nAjuda:\n          Tem as instruções para usar o software.\n\nSair:\n           Todo botão vermelho no canto superior direito.\n           Tem o botão de sair no menu principal.\n\nVoltar:\n           Todo botão com seta azul no canto superior direito.\n");
        jScrollPaneTelaPrincipal.setViewportView(jTextAreaTelaPrincipal);

        jLabelRelatorioEDetalhes.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelRelatorioEDetalhes.setForeground(java.awt.Color.black);
        jLabelRelatorioEDetalhes.setText("Relatorio e Detalhes:");

        jTextAreaRelatorioEDetalhes.setEditable(false);
        jTextAreaRelatorioEDetalhes.setColumns(20);
        jTextAreaRelatorioEDetalhes.setRows(5);
        jTextAreaRelatorioEDetalhes.setText("Relatorio:\n          Tem os dados de todos os deputados.\n          Clica no botão mais informações para ter os detalhes dos deputados, e mostrar a foto dele.\n\nDetalhes:\n          Apresenta os detalhes junto com a foto do deputado.\n");
        jScrollPaneRelatorioEDetalhes.setViewportView(jTextAreaRelatorioEDetalhes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelAjuda, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                                .addGap(26, 26, 26)
                                .addComponent(jButtonFechar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelLogin)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jScrollPaneTelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPaneLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTelaPrincipal)
                            .addComponent(jLabelRelatorioEDetalhes)
                            .addComponent(jScrollPaneRelatorioEDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelAjuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTelaPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneTelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelRelatorioEDetalhes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneRelatorioEDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JLabel jLabelAjuda;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelRelatorioEDetalhes;
    private javax.swing.JLabel jLabelTelaPrincipal;
    private javax.swing.JScrollPane jScrollPaneLogin;
    private javax.swing.JScrollPane jScrollPaneRelatorioEDetalhes;
    private javax.swing.JScrollPane jScrollPaneTelaPrincipal;
    private javax.swing.JTextArea jTextAreaLogin;
    private javax.swing.JTextArea jTextAreaRelatorioEDetalhes;
    private javax.swing.JTextArea jTextAreaTelaPrincipal;
    // End of variables declaration//GEN-END:variables
}
