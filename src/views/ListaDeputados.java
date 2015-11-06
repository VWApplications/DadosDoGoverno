package views;

import javax.swing.ListSelectionModel;
import models.DadosAbertos;
import models.ModeloTabela;

public class ListaDeputados extends javax.swing.JFrame{
    
    public String nome, partido, estado, email, telefone, condicao, sexo, IDCadastro, matricula, nomeParlamentar,
                  gabinete, anexo, linkFoto, UF, legislatura, dataNascimento, dataMorte, numeroLegislatura;
    
    public ListaDeputados() {
        initComponents();
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameListaDeputados = new javax.swing.JInternalFrame();
        jScrollPaneListaDeputados = new javax.swing.JScrollPane();
        jTableListaDeputados = new javax.swing.JTable();
        jComboBoxOrdem = new javax.swing.JComboBox();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jButtonRelatorio = new javax.swing.JButton();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(630, 487));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        jInternalFrameListaDeputados.setTitle("Lista de Deputados");
        jInternalFrameListaDeputados.setVisible(true);
        jInternalFrameListaDeputados.getContentPane().setLayout(null);

        jTableListaDeputados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableListaDeputados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListaDeputadosMouseClicked(evt);
            }
        });
        jScrollPaneListaDeputados.setViewportView(jTableListaDeputados);

        jInternalFrameListaDeputados.getContentPane().add(jScrollPaneListaDeputados);
        jScrollPaneListaDeputados.setBounds(0, 262, 620, 190);

        jComboBoxOrdem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ordem Alfabetica", "Ordem por Partido", "Ordem por Estado" }));
        jInternalFrameListaDeputados.getContentPane().add(jComboBoxOrdem);
        jComboBoxOrdem.setBounds(190, 20, 260, 27);
        jInternalFrameListaDeputados.getContentPane().add(jTextFieldPesquisar);
        jTextFieldPesquisar.setBounds(200, 150, 220, 27);

        jButtonPesquisar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.png"))); // NOI18N
        jButtonPesquisar.setText("PESQUISAR");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        jInternalFrameListaDeputados.getContentPane().add(jButtonPesquisar);
        jButtonPesquisar.setBounds(200, 180, 220, 70);

        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fechar.png"))); // NOI18N
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        jInternalFrameListaDeputados.getContentPane().add(jButtonFechar);
        jButtonFechar.setBounds(580, 0, 40, 40);

        jButtonRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/relatorio.png"))); // NOI18N
        jButtonRelatorio.setToolTipText("Mostrar relatorio do deputado");
        jButtonRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelatorioActionPerformed(evt);
            }
        });
        jInternalFrameListaDeputados.getContentPane().add(jButtonRelatorio);
        jButtonRelatorio.setBounds(0, 0, 60, 70);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/debate.jpg"))); // NOI18N
        jInternalFrameListaDeputados.getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, -4, 620, 460);

        getContentPane().add(jInternalFrameListaDeputados);
        jInternalFrameListaDeputados.setBounds(0, 0, 630, 480);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    
    private void jButtonRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelatorioActionPerformed
        RelatorioDeputados relatorio = new RelatorioDeputados(nome, partido, estado, email, telefone, condicao,
                                                              sexo, IDCadastro, matricula, nomeParlamentar,
                                                              gabinete, anexo, linkFoto, UF, legislatura,
                                                              dataNascimento, dataMorte, numeroLegislatura);
        relatorio.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRelatorioActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        

    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTableListaDeputadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListaDeputadosMouseClicked
         nome = ""+jTableListaDeputados.getValueAt(jTableListaDeputados.getSelectedRow(), 0);
         partido = ""+jTableListaDeputados.getValueAt(jTableListaDeputados.getSelectedRow(), 1);
         estado = ""+jTableListaDeputados.getValueAt(jTableListaDeputados.getSelectedRow(), 2);
         email = ""+jTableListaDeputados.getValueAt(jTableListaDeputados.getSelectedRow(), 3);
         telefone = ""+jTableListaDeputados.getValueAt(jTableListaDeputados.getSelectedRow(), 4);
         condicao = ""+jTableListaDeputados.getValueAt(jTableListaDeputados.getSelectedRow(), 5);
         sexo = ""+jTableListaDeputados.getValueAt(jTableListaDeputados.getSelectedRow(), 6);
         IDCadastro = ""+jTableListaDeputados.getValueAt(jTableListaDeputados.getSelectedRow(), 7);
         matricula = ""+jTableListaDeputados.getValueAt(jTableListaDeputados.getSelectedRow(), 8);
         nomeParlamentar = ""+jTableListaDeputados.getValueAt(jTableListaDeputados.getSelectedRow(), 9);
         gabinete = ""+jTableListaDeputados.getValueAt(jTableListaDeputados.getSelectedRow(), 10);
         anexo = ""+jTableListaDeputados.getValueAt(jTableListaDeputados.getSelectedRow(), 11);
         linkFoto = ""+jTableListaDeputados.getValueAt(jTableListaDeputados.getSelectedRow(), 12);
         UF = ""+jTableListaDeputados.getValueAt(jTableListaDeputados.getSelectedRow(), 13);
         legislatura = ""+jTableListaDeputados.getValueAt(jTableListaDeputados.getSelectedRow(), 14);
         dataNascimento = ""+jTableListaDeputados.getValueAt(jTableListaDeputados.getSelectedRow(), 15);
         dataMorte = ""+jTableListaDeputados.getValueAt(jTableListaDeputados.getSelectedRow(), 16);
         numeroLegislatura = ""+jTableListaDeputados.getValueAt(jTableListaDeputados.getSelectedRow(), 17);        
    }//GEN-LAST:event_jTableListaDeputadosMouseClicked

    public void preencherTabela(){
        
        ModeloTabela tabelaDeputados = DadosAbertos.getTabelaDeputados();
        
        //Vamos inserir o modelo de tabela criado na tabela da interface
        jTableListaDeputados.setModel(tabelaDeputados);
        //getColumnModel = Dentro do campos de colunas
        //getColumn(0) = primeiro registro, os arrays começam a contar do zero que é o "Nome"
        //setPreferredWidth(250) = Largura da coluna será 250
        //setResizable(false) = usuario não vai poder mexer no tamanho da coluna
        jTableListaDeputados.getColumnModel().getColumn(0).setPreferredWidth(250);
        jTableListaDeputados.getColumnModel().getColumn(0).setResizable(false);
        jTableListaDeputados.getColumnModel().getColumn(1).setPreferredWidth(60);
        jTableListaDeputados.getColumnModel().getColumn(1).setResizable(false);
        jTableListaDeputados.getColumnModel().getColumn(2).setPreferredWidth(60);
        jTableListaDeputados.getColumnModel().getColumn(2).setResizable(false);
        jTableListaDeputados.getColumnModel().getColumn(3).setPreferredWidth(250);
        jTableListaDeputados.getColumnModel().getColumn(3).setResizable(false);
        jTableListaDeputados.getColumnModel().getColumn(4).setPreferredWidth(100);
        jTableListaDeputados.getColumnModel().getColumn(4).setResizable(false);
        jTableListaDeputados.getColumnModel().getColumn(5).setPreferredWidth(100);
        jTableListaDeputados.getColumnModel().getColumn(5).setResizable(false);
        //getTableHeader() = pegar o cabeçalho da tabela
        //setReorderingAllowed(false) = usuario não irá poder reorganizar o cabeçalho da tabela
        jTableListaDeputados.getTableHeader().setReorderingAllowed(false);
         //A tabela não poderá ser redimensionada
        jTableListaDeputados.setAutoResizeMode(jTableListaDeputados.AUTO_RESIZE_OFF);
        //Usuario só vai poder selecionar um dado da nossa tabela por vez
        jTableListaDeputados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonRelatorio;
    private javax.swing.JComboBox jComboBoxOrdem;
    private javax.swing.JInternalFrame jInternalFrameListaDeputados;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JScrollPane jScrollPaneListaDeputados;
    private javax.swing.JTable jTableListaDeputados;
    private javax.swing.JTextField jTextFieldPesquisar;
    // End of variables declaration//GEN-END:variables

}
