package controllers;

import edu.unb.fga.dadosabertos.Deputado;
import edu.unb.fga.dadosabertos.Detalhes;
import edu.unb.fga.dadosabertos.Partido;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBException;
import models.DadosAbertos;
import models.ModeloTabela;

public class ControleTabela {
    

    public static void criarTabela(List<Deputado> deputados){
            
        ArrayList linhasDeDadosDeputados = new ArrayList();
        ArrayList linhasDeDadosDetalhes = new ArrayList();
        ArrayList linhasDeDadosPartidos = new ArrayList();
        String[] colunasDeputados = new String[]{"Nome","Partido","Estado","Email","Telefone","Condição",};
        String[] colunasDetalhes = new String[]{"Nome","Partido","Estado","Email","Telefone","Condição",
                                                "sexo", "ID de cadastro", "Matricula", "Nome Parlamentar", 
                                                "Gabinete", "Anexo", "Link da foto", "UF", "Legislatura", 
                                                "Data de nascimento", "Data de falecimento", "Número de legislatura"};
        String[] colunasPartidos = new String[]{"ID", "Sigla", "Nome"};
        
            for(Deputado deputado: deputados){

                try {
                    deputado.obterDetalhes();
                    System.out.print("|");
                } catch (IOException | JAXBException ex) {
                    JOptionPane.showMessageDialog(null, "Erro na obtenção dos detalhes");
                }
                
                Detalhes detalhes = deputado.getDetalhes();
                
                linhasDeDadosDetalhes.add(new Object[]{deputado.getNome(),deputado.getPartido(),
                                               deputado.getUf(), deputado.getEmail(), deputado.getFone(),
                                               deputado.getCondicao(), deputado.getSexo(), deputado.getIdeCadastro(),
                                               deputado.getMatricula(), deputado.getNomeParlamentar(), deputado.getGabinete(),
                                               deputado.getAnexo(), deputado.getUrlFoto(), detalhes.getUfRepresentacaoAtual(),
                                               detalhes.getSituacaoNaLegislaturaAtual(), detalhes.getDataNascimento(), 
                                               detalhes.getDataFalecimento(), detalhes.getNumLegislatura()});  
                
                Partido partidos = detalhes.getPartido();
                
                linhasDeDadosPartidos.add(new Object[]{partidos.getIdPartido(),
                                                       partidos.getSigla(),
                                                       partidos.getNome()});
            }           
            
            DadosAbertos.setLinhasDeDadosDeputados(linhasDeDadosDeputados);
            DadosAbertos.setLinhasDeDadosDetalhes(linhasDeDadosDetalhes);
            DadosAbertos.setLinhasDeDadosPartidos(linhasDeDadosPartidos);
            ModeloTabela tabelaDetalhes = new ModeloTabela(linhasDeDadosDetalhes, colunasDetalhes);
            DadosAbertos.setTabelaDeputados(tabelaDetalhes);
            ModeloTabela tabelaPartidos = new ModeloTabela(linhasDeDadosPartidos, colunasPartidos);
            DadosAbertos.setTabelaPartidos(tabelaPartidos);
            
    }
    
    public static ModeloTabela filtrarPartidos(){
        ModeloTabela tabela = DadosAbertos.getTabelaPartidos();
        ArrayList<Object> dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Sigla", "Nome"};

            //Add a primeira linha na tabela
            Object ID1 = tabela.getValueAt(0, 0);
            Object sigla1 = tabela.getValueAt(0, 1);
            Object nome1 = tabela.getValueAt(0, 2);
            dados.add(new Object[]{ID1, sigla1, nome1});
        
            //Percorrer todas as linhas da tabela
            for(int i = 0; i<tabela.getRowCount(); i++){
                    //Verificar a primeira ocorrencia de um determinado elemento no array dados
                    //Se a string se repetir então ele cai no print caso contrario e add no array 
                    if(dados.indexOf(tabela.getValueAt(i, 0))!=-1){
                        System.out.println("repetido");
                    }else{
                            Object ID = tabela.getValueAt(i, 0);
                            Object sigla = tabela.getValueAt(i, 1);
                            Object nome = tabela.getValueAt(i, 2);
                            
                            
                            dados.add(new Object[]{ID, sigla, nome});
                    }  
            }
                ModeloTabela Modeltabela = new ModeloTabela(dados, colunas);
                return Modeltabela;
    }
}
