package views;

import controllers.ControleTabela;
import edu.unb.fga.dadosabertos.Deputado;
import java.util.List;
import javax.swing.ListSelectionModel;
import models.DadosAbertos;
import models.ModeloTabela;

public class ListaDeputados2 extends javax.swing.JFrame{
    
    ModeloTabela tabela;
    
    public ListaDeputados2(List<Deputado> deputados) {
        initComponents();
        preencherTabela(deputados);
        tabela = DadosAbertos.getTabela();
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
        jLabelFundo = new javax.swing.JLabel();
        jLabelPartido = new javax.swing.JLabel();
        jTextFieldPartido = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        jTextFieldEstado = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabelCondicao = new javax.swing.JLabel();
        jTextFieldCondicao = new javax.swing.JTextField();
        jLabelMatricula = new javax.swing.JLabel();
        jTextFieldMatricula = new javax.swing.JTextField();
        jLabelSexo = new javax.swing.JLabel();
        jTextFieldSexo = new javax.swing.JTextField();
        jLabelGabinete = new javax.swing.JLabel();
        jTextFieldGabinete = new javax.swing.JTextField();
        jLabelAnexo = new javax.swing.JLabel();
        jTextFieldAnexo = new javax.swing.JTextField();
        jLabelNomeParlamentar = new javax.swing.JLabel();
        jTextFieldNomeParlamentar = new javax.swing.JTextField();
        jLabelUFRepresentacaoAtual = new javax.swing.JLabel();
        jTextFieldUFDeLegislaturaAtual = new javax.swing.JTextField();
        jLabelSituacao = new javax.swing.JLabel();
        jTextFieldSituacao = new javax.swing.JTextField();
        jLabelDataDeNascimento = new javax.swing.JLabel();
        jTextFieldDataNascimento = new javax.swing.JTextField();
        jLabelNumeroLegislatura = new javax.swing.JLabel();
        jTextFieldNumeroLegislatura = new javax.swing.JTextField();
        jPanelFoto = new javax.swing.JPanel();
        jLabelFoto = new javax.swing.JLabel();
        jLabelRelatorio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1008, 557));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 1000));
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
        jScrollPaneListaDeputados.setBounds(0, 340, 610, 190);

        jComboBoxOrdem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ordem Alfabetica", "Ordem por Partido", "Ordem por Estado" }));
        jInternalFrameListaDeputados.getContentPane().add(jComboBoxOrdem);
        jComboBoxOrdem.setBounds(190, 20, 260, 27);
        jInternalFrameListaDeputados.getContentPane().add(jTextFieldPesquisar);
        jTextFieldPesquisar.setBounds(200, 200, 220, 27);

        jButtonPesquisar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.png"))); // NOI18N
        jButtonPesquisar.setText("PESQUISAR");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        jInternalFrameListaDeputados.getContentPane().add(jButtonPesquisar);
        jButtonPesquisar.setBounds(200, 250, 220, 70);

        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fechar.png"))); // NOI18N
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        jInternalFrameListaDeputados.getContentPane().add(jButtonFechar);
        jButtonFechar.setBounds(960, 0, 40, 40);

        jLabelFundo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelFundo.setForeground(java.awt.Color.white);
        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/debate.png"))); // NOI18N
        jInternalFrameListaDeputados.getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, 0, 620, 530);

        jLabelPartido.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelPartido.setForeground(java.awt.Color.white);
        jLabelPartido.setText("Partido:");
        jInternalFrameListaDeputados.getContentPane().add(jLabelPartido);
        jLabelPartido.setBounds(640, 10, 80, 21);

        jTextFieldPartido.setEditable(false);
        jInternalFrameListaDeputados.getContentPane().add(jTextFieldPartido);
        jTextFieldPartido.setBounds(720, 10, 60, 27);

        jLabelEstado.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelEstado.setForeground(java.awt.Color.white);
        jLabelEstado.setText("Estado:");
        jInternalFrameListaDeputados.getContentPane().add(jLabelEstado);
        jLabelEstado.setBounds(790, 10, 70, 21);

        jTextFieldEstado.setEditable(false);
        jInternalFrameListaDeputados.getContentPane().add(jTextFieldEstado);
        jTextFieldEstado.setBounds(860, 10, 60, 27);

        jLabelID.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelID.setForeground(java.awt.Color.white);
        jLabelID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelID.setText("ID:");
        jInternalFrameListaDeputados.getContentPane().add(jLabelID);
        jLabelID.setBounds(520, 10, 50, 21);

        jTextFieldID.setEditable(false);
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });
        jInternalFrameListaDeputados.getContentPane().add(jTextFieldID);
        jTextFieldID.setBounds(580, 10, 50, 27);

        jLabelNome.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelNome.setForeground(java.awt.Color.white);
        jLabelNome.setText("Nome:");
        jInternalFrameListaDeputados.getContentPane().add(jLabelNome);
        jLabelNome.setBounds(580, 60, 70, 21);

        jTextFieldNome.setEditable(false);
        jInternalFrameListaDeputados.getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(640, 60, 350, 27);

        jLabelEmail.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelEmail.setForeground(java.awt.Color.white);
        jLabelEmail.setText("Email:");
        jInternalFrameListaDeputados.getContentPane().add(jLabelEmail);
        jLabelEmail.setBounds(580, 90, 60, 21);

        jTextFieldEmail.setEditable(false);
        jInternalFrameListaDeputados.getContentPane().add(jTextFieldEmail);
        jTextFieldEmail.setBounds(640, 90, 350, 27);

        jLabelTelefone.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelTelefone.setForeground(java.awt.Color.white);
        jLabelTelefone.setText("Telefone:");
        jInternalFrameListaDeputados.getContentPane().add(jLabelTelefone);
        jLabelTelefone.setBounds(630, 120, 90, 21);

        jTextFieldTelefone.setEditable(false);
        jInternalFrameListaDeputados.getContentPane().add(jTextFieldTelefone);
        jTextFieldTelefone.setBounds(720, 120, 270, 27);

        jLabelCondicao.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelCondicao.setForeground(java.awt.Color.white);
        jLabelCondicao.setText("Condição:");
        jInternalFrameListaDeputados.getContentPane().add(jLabelCondicao);
        jLabelCondicao.setBounds(630, 150, 90, 21);

        jTextFieldCondicao.setEditable(false);
        jInternalFrameListaDeputados.getContentPane().add(jTextFieldCondicao);
        jTextFieldCondicao.setBounds(720, 150, 270, 27);

        jLabelMatricula.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelMatricula.setForeground(java.awt.Color.white);
        jLabelMatricula.setText("Matricula:");
        jInternalFrameListaDeputados.getContentPane().add(jLabelMatricula);
        jLabelMatricula.setBounds(630, 180, 90, 21);

        jTextFieldMatricula.setEditable(false);
        jInternalFrameListaDeputados.getContentPane().add(jTextFieldMatricula);
        jTextFieldMatricula.setBounds(720, 180, 270, 27);

        jLabelSexo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelSexo.setForeground(java.awt.Color.white);
        jLabelSexo.setText("Sexo:");
        jInternalFrameListaDeputados.getContentPane().add(jLabelSexo);
        jLabelSexo.setBounds(670, 210, 49, 17);

        jTextFieldSexo.setEditable(false);
        jInternalFrameListaDeputados.getContentPane().add(jTextFieldSexo);
        jTextFieldSexo.setBounds(720, 210, 270, 27);

        jLabelGabinete.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelGabinete.setForeground(java.awt.Color.white);
        jLabelGabinete.setText("Gabinete:");
        jInternalFrameListaDeputados.getContentPane().add(jLabelGabinete);
        jLabelGabinete.setBounds(630, 240, 90, 21);

        jTextFieldGabinete.setEditable(false);
        jInternalFrameListaDeputados.getContentPane().add(jTextFieldGabinete);
        jTextFieldGabinete.setBounds(720, 240, 90, 27);

        jLabelAnexo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelAnexo.setForeground(java.awt.Color.white);
        jLabelAnexo.setText("Anexo:");
        jInternalFrameListaDeputados.getContentPane().add(jLabelAnexo);
        jLabelAnexo.setBounds(820, 240, 70, 21);

        jTextFieldAnexo.setEditable(false);
        jInternalFrameListaDeputados.getContentPane().add(jTextFieldAnexo);
        jTextFieldAnexo.setBounds(900, 240, 90, 27);

        jLabelNomeParlamentar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelNomeParlamentar.setForeground(java.awt.Color.white);
        jLabelNomeParlamentar.setText("Nome Parlamentar:");
        jInternalFrameListaDeputados.getContentPane().add(jLabelNomeParlamentar);
        jLabelNomeParlamentar.setBounds(590, 270, 170, 21);

        jTextFieldNomeParlamentar.setEditable(false);
        jInternalFrameListaDeputados.getContentPane().add(jTextFieldNomeParlamentar);
        jTextFieldNomeParlamentar.setBounds(760, 270, 230, 27);

        jLabelUFRepresentacaoAtual.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelUFRepresentacaoAtual.setForeground(java.awt.Color.white);
        jLabelUFRepresentacaoAtual.setText("UF Representação Atual:");
        jInternalFrameListaDeputados.getContentPane().add(jLabelUFRepresentacaoAtual);
        jLabelUFRepresentacaoAtual.setBounds(600, 300, 240, 17);

        jTextFieldUFDeLegislaturaAtual.setEditable(false);
        jInternalFrameListaDeputados.getContentPane().add(jTextFieldUFDeLegislaturaAtual);
        jTextFieldUFDeLegislaturaAtual.setBounds(820, 300, 170, 27);

        jLabelSituacao.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelSituacao.setForeground(java.awt.Color.white);
        jLabelSituacao.setText("Situação Legislatura:");
        jInternalFrameListaDeputados.getContentPane().add(jLabelSituacao);
        jLabelSituacao.setBounds(620, 330, 190, 20);

        jTextFieldSituacao.setEditable(false);
        jInternalFrameListaDeputados.getContentPane().add(jTextFieldSituacao);
        jTextFieldSituacao.setBounds(810, 330, 180, 27);

        jLabelDataDeNascimento.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelDataDeNascimento.setForeground(java.awt.Color.white);
        jLabelDataDeNascimento.setText("Data de Nascimento:");
        jInternalFrameListaDeputados.getContentPane().add(jLabelDataDeNascimento);
        jLabelDataDeNascimento.setBounds(620, 360, 190, 17);

        jTextFieldDataNascimento.setEditable(false);
        jInternalFrameListaDeputados.getContentPane().add(jTextFieldDataNascimento);
        jTextFieldDataNascimento.setBounds(810, 360, 180, 27);

        jLabelNumeroLegislatura.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelNumeroLegislatura.setForeground(java.awt.Color.white);
        jLabelNumeroLegislatura.setText("Número de legislatura:");
        jInternalFrameListaDeputados.getContentPane().add(jLabelNumeroLegislatura);
        jLabelNumeroLegislatura.setBounds(610, 390, 210, 21);

        jTextFieldNumeroLegislatura.setEditable(false);
        jInternalFrameListaDeputados.getContentPane().add(jTextFieldNumeroLegislatura);
        jTextFieldNumeroLegislatura.setBounds(810, 390, 180, 27);
        jInternalFrameListaDeputados.getContentPane().add(jPanelFoto);
        jPanelFoto.setBounds(860, 420, 120, 100);

        jLabelFoto.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabelFoto.setForeground(java.awt.Color.black);
        jLabelFoto.setText("FOTO:");
        jInternalFrameListaDeputados.getContentPane().add(jLabelFoto);
        jLabelFoto.setBounds(720, 450, 120, 43);

        jLabelRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/telaDeFundo7.jpg"))); // NOI18N
        jInternalFrameListaDeputados.getContentPane().add(jLabelRelatorio);
        jLabelRelatorio.setBounds(0, 0, 1000, 530);

        getContentPane().add(jInternalFrameListaDeputados);
        jInternalFrameListaDeputados.setBounds(0, 0, 1010, 560);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
   
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        jTextFieldID.setText(String.valueOf(tabela.getValueAt(jTableListaDeputados.getSelectedRow(),1)));
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    public void preencherTabela(List<Deputado> deputados){
        
        ModeloTabela tabela = ControleTabela.criarTabela(deputados, 1);
        
        DadosAbertos.setTabela(tabela);
        
        //Vamos inserir o modelo de tabela criado na tabela da interface
        jTableListaDeputados.setModel(tabela);
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
    private javax.swing.JComboBox jComboBoxOrdem;
    private javax.swing.JInternalFrame jInternalFrameListaDeputados;
    private javax.swing.JLabel jLabelAnexo;
    private javax.swing.JLabel jLabelCondicao;
    private javax.swing.JLabel jLabelDataDeNascimento;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelGabinete;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNomeParlamentar;
    private javax.swing.JLabel jLabelNumeroLegislatura;
    private javax.swing.JLabel jLabelPartido;
    private javax.swing.JLabel jLabelRelatorio;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelSituacao;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelUFRepresentacaoAtual;
    private javax.swing.JPanel jPanelFoto;
    private javax.swing.JScrollPane jScrollPaneListaDeputados;
    private javax.swing.JTable jTableListaDeputados;
    private javax.swing.JTextField jTextFieldAnexo;
    private javax.swing.JTextField jTextFieldCondicao;
    private javax.swing.JTextField jTextFieldDataNascimento;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldGabinete;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNomeParlamentar;
    private javax.swing.JTextField jTextFieldNumeroLegislatura;
    private javax.swing.JTextField jTextFieldPartido;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldSexo;
    private javax.swing.JTextField jTextFieldSituacao;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldUFDeLegislaturaAtual;
    // End of variables declaration//GEN-END:variables

}
