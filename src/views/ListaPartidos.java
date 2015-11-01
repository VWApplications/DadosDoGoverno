package views;

import controllers.ControleTabela;
import controllers.ObterDados;
import edu.unb.fga.dadosabertos.Camara;
import edu.unb.fga.dadosabertos.Deputado;
import edu.unb.fga.dadosabertos.Detalhes;
import edu.unb.fga.dadosabertos.Partido;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.xml.bind.JAXBException;
import models.ModeloTabela;

public class ListaPartidos extends javax.swing.JFrame {  
    
      Camara camara = new Camara();
      List<Deputado> deputados = camara.getDeputados();
    
    public ListaPartidos() {
        initComponents();
        //preencherTabela(deputados);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameListaPartidos = new javax.swing.JInternalFrame();
        jScrollPaneListarPartidos = new javax.swing.JScrollPane();
        jTableListarPartidos = new javax.swing.JTable();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jComboBoxOrdem = new javax.swing.JComboBox();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(630, 480));
        setPreferredSize(new java.awt.Dimension(630, 478));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        jInternalFrameListaPartidos.setTitle("Deputados por Partido");
        jInternalFrameListaPartidos.setVisible(true);
        jInternalFrameListaPartidos.getContentPane().setLayout(null);

        jTableListarPartidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPaneListarPartidos.setViewportView(jTableListarPartidos);

        jInternalFrameListaPartidos.getContentPane().add(jScrollPaneListarPartidos);
        jScrollPaneListarPartidos.setBounds(0, 252, 620, 200);
        jInternalFrameListaPartidos.getContentPane().add(jTextFieldPesquisa);
        jTextFieldPesquisa.setBounds(200, 150, 220, 27);

        jComboBoxOrdem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ordem Alfabetica", " " }));
        jInternalFrameListaPartidos.getContentPane().add(jComboBoxOrdem);
        jComboBoxOrdem.setBounds(190, 10, 260, 27);

        jButtonPesquisar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.png"))); // NOI18N
        jButtonPesquisar.setText("PESQUISAR");
        jInternalFrameListaPartidos.getContentPane().add(jButtonPesquisar);
        jButtonPesquisar.setBounds(200, 180, 220, 70);

        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fechar.png"))); // NOI18N
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        jInternalFrameListaPartidos.getContentPane().add(jButtonFechar);
        jButtonFechar.setBounds(580, 0, 40, 40);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/debate.jpg"))); // NOI18N
        jInternalFrameListaPartidos.getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, 0, 620, 450);

        getContentPane().add(jInternalFrameListaPartidos);
        jInternalFrameListaPartidos.setBounds(0, 0, 630, 480);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    public void preencherTabela(List<Deputado> deputados){
        
        ModeloTabela tabela = ControleTabela.criarTabelaPartido(deputados);
        
        jTableListarPartidos.setModel(tabela);
        //getColumnModel = Dentro do campos de colunas
        //getColumn(0) = primeiro registro, os arrays começam a contar do zero que é o "ID"
        //setPreferredWidth(23) = Largura da coluna será 23
        //setResizable(false) = usuario não vai poder mexer no tamanho da coluna
        jTableListarPartidos.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTableListarPartidos.getColumnModel().getColumn(0).setResizable(false);
        jTableListarPartidos.getColumnModel().getColumn(1).setPreferredWidth(80);
        jTableListarPartidos.getColumnModel().getColumn(1).setResizable(false);
        jTableListarPartidos.getColumnModel().getColumn(2).setPreferredWidth(200);
        jTableListarPartidos.getColumnModel().getColumn(2).setResizable(false);
        //getTableHeader() = pegar o cabeçalho da tabela
        //setReorderingAllowed(false) = usuario não irá poder reorganizar o cabeçalho da tabela
        jTableListarPartidos.getTableHeader().setReorderingAllowed(false);
         //A tabela não poderá ser redimensionada
        jTableListarPartidos.setAutoResizeMode(jTableListarPartidos.AUTO_RESIZE_OFF);
        //Usuario só vai poder selecionar um dado da nossa tabela por vez
        jTableListarPartidos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(ListaPartidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaPartidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaPartidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaPartidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        ObterDados dados = new ObterDados(1);
        dados.start();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaPartidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JComboBox jComboBoxOrdem;
    private javax.swing.JInternalFrame jInternalFrameListaPartidos;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JScrollPane jScrollPaneListarPartidos;
    private javax.swing.JTable jTableListarPartidos;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables
}
