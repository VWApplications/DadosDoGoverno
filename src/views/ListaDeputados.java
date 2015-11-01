package views;

import controllers.ControleTabela;
import edu.unb.fga.dadosabertos.Camara;
import edu.unb.fga.dadosabertos.Deputado;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ListSelectionModel;
import models.ModeloTabela;
import models.ModeloDeputado;

public class ListaDeputados extends javax.swing.JFrame {
    
    Camara camara = new Camara();
    List<Deputado> deputados = camara.getDeputados();
    ModeloDeputado pesquisa = new ModeloDeputado();
    
    public ListaDeputados() {
        initComponents();
        //preencherTabela(deputados);
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
        RelatorioDeputados relatorio = new RelatorioDeputados();
        relatorio.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRelatorioActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        pesquisa.setPesquisar(jTextFieldPesquisar.getText());

    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    public void preencherTabela(List<Deputado> deputados){
        
        //ModeloTabela tabela = ControleTabela.criarTabelaDeputado(deputados);
        
        ArrayList linhasDeDados = new ArrayList();
        String[] colunas = new String[]{"Nome", "Partido", "Estado", "Email", "Telefone", "Condição"};
        
        for(Deputado deputado: deputados){
            linhasDeDados.add(new Object[]{deputado.getNome(),deputado.getPartido(),
                                           deputado.getUf(), deputado.getEmail(),
                                           deputado.getFone(), deputado.getCondicao()});
        }
        
        ModeloTabela tabela = new ModeloTabela(linhasDeDados, colunas);
        
        //Vamos inserir o modelo de tabela criado na tabela da interface
        jTableListaDeputados.setModel(tabela);
        //getColumnModel = Dentro do campos de colunas
        //getColumn(0) = primeiro registro, os arrays começam a contar do zero que é o "ID"
        //setPreferredWidth(250) = Largura da coluna será 250
        //setResizable(false) = usuario não vai poder mexer no tamanho da coluna
        jTableListaDeputados.getColumnModel().getColumn(0).setPreferredWidth(250);
        jTableListaDeputados.getColumnModel().getColumn(0).setResizable(false);
        jTableListaDeputados.getColumnModel().getColumn(1).setPreferredWidth(40);
        jTableListaDeputados.getColumnModel().getColumn(1).setResizable(false);
        jTableListaDeputados.getColumnModel().getColumn(2).setPreferredWidth(40);
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
            java.util.logging.Logger.getLogger(ListaDeputados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaDeputados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaDeputados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaDeputados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaDeputados().setVisible(true);
            }
        });
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
