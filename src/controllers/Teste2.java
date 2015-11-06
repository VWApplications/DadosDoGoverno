package controllers;

import edu.unb.fga.dadosabertos.Camara;
import edu.unb.fga.dadosabertos.Deputado;
import edu.unb.fga.dadosabertos.Detalhes;
import edu.unb.fga.dadosabertos.Partido;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.xml.bind.JAXBException;
import models.DadosAbertos;
import models.ModeloTabela;

/**
 *
 * @author victor
 */
public class Teste2 {
   
    public static void main(String[] args){
        
        Camara camara = new Camara();
        try {
            camara.obterDados();
        } catch (JAXBException | IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro na obtenção dos dados");
        }
        List<Deputado> deputados = camara.getDeputados();

        ArrayList linhasDeDadosDeputados = new ArrayList();
        ArrayList linhasDeDadosDetalhes = new ArrayList();
        ArrayList linhasDeDadosPartidos = new ArrayList();
        String[] colunasDeputados = new String[]{"Nome", "Partido", "Estado", "Email", "Telefone", "Condição"};
        String[] colunasDetalhes = new String[]{"UF", "Legislatura", "Data de nascimento", "Data de falecimento", "Número de legislatura"};
        String[] colunasPartidos = new String[]{"ID", "Sigla", "Nome"};
        
            for(Deputado deputado: deputados){
                linhasDeDadosDeputados.add(new Object[]{deputado.getNome(),deputado.getPartido(),
                                               deputado.getUf(), deputado.getEmail(),
                                               deputado.getFone(), deputado.getCondicao()});
                
                try {
                    deputado.obterDetalhes();
                    System.out.print("|");
                } catch (IOException | JAXBException ex) {
                    JOptionPane.showMessageDialog(null, "Erro na obtenção dos detalhes");
                }
                
                Detalhes detalhes = deputado.getDetalhes();
                
                linhasDeDadosDetalhes.add(new Object[]{detalhes.getUfRepresentacaoAtual(),
                                                       detalhes.getSituacaoNaLegislaturaAtual(),
                                                       detalhes.getDataNascimento(),
                                                       detalhes.getDataFalecimento(),
                                                       detalhes.getNumLegislatura()});
                
               
                Partido partidos = detalhes.getPartido();

                linhasDeDadosPartidos.add(new Object[]{partidos.getIdPartido(),
                                                       partidos.getSigla(),
                                                       partidos.getNome()});
                    
                
            }
            
            DadosAbertos.setLinhasDeDadosDeputados(linhasDeDadosDeputados);
            DadosAbertos.setLinhasDeDadosDetalhes(linhasDeDadosDetalhes);
            DadosAbertos.setLinhasDeDadosPartidos(linhasDeDadosPartidos);            
            
            ModeloTabela tabela1 = new ModeloTabela(linhasDeDadosDeputados, colunasDeputados);
            ModeloTabela tabela2 = new ModeloTabela(linhasDeDadosDetalhes, colunasDetalhes);
            ModeloTabela tabela3 = new ModeloTabela(linhasDeDadosPartidos, colunasPartidos);
            
            for(int i=0; i<tabela1.getRowCount(); i++){
                for(int j=0; j<tabela1.getColumnCount(); j++){
                    Object objetos1 = tabela1.getValueAt(i, j);
                    System.out.println(objetos1);
                }
            }
            
            System.out.println("\n\n");
            
            for(int i=0; i<tabela2.getRowCount(); i++){
                for(int j=0; j<tabela2.getColumnCount(); j++){
                    Object objetos2 = tabela2.getValueAt(i, j);
                    System.out.println(objetos2);
                }
            }
             
            System.out.println("\n\n");
            
            for(int i=0; i<tabela3.getRowCount(); i++){
                for(int j=0; j<tabela3.getColumnCount(); j++){
                    Object objetos3 = tabela3.getValueAt(i, j);
                    System.out.println(objetos3);
                }
            }
            
    }
    
    
}
    
