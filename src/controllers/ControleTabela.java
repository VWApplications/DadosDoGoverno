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
    

    public static /*ModeloTabela*/ void criarTabela(List<Deputado> deputados/*, int opcao*/){
            
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
            
            /*if(opcao == 1){
                ModeloTabela tabelaDetalhes = new ModeloTabela(linhasDeDadosDetalhes, colunasDetalhes);
                return tabelaDetalhes;
            }else if(opcao == 2){
                ModeloTabela tabelaPartidos = new ModeloTabela(linhasDeDadosPartidos, colunasPartidos);
                return tabelaPartidos;
            }*/
        //return null;
    }
}