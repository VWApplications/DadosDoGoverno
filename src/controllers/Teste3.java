
package controllers;

import java.util.ArrayList;
import models.DadosAbertos;
import models.ModeloTabela;

public class Teste3 {
    
    public void main(String[] args) {
    
        ArrayList linhasDeDadosDeputados = DadosAbertos.getLinhasDeDadosDeputados();
        //ArrayList linhasDeDadosDetalhes = DadosAbertos.getLinhasDeDadosDetalhes();
        //ArrayList linhasDeDadosPartidos = DadosAbertos.getLinhasDeDadosPartidos();
        String[] colunasDeputados = new String[]{"Nome", "Partido", "Estado", "Email", "Telefone", "Condição"};
        //String[] colunasDetalhes = new String[]{"UF", "Legislatura", "Data de nascimento", "Data de falecimento", "Número de legislatura"};
        //String[] colunasPartidos = new String[]{"ID", "Sigla", "Nome"};
        
        System.out.println(linhasDeDadosDeputados.get(0));
        
        
        //ModeloTabela tabela1 = new ModeloTabela(linhasDeDadosDeputados, colunasDeputados);
        //ModeloTabela tabela2 = new ModeloTabela(linhasDeDadosDetalhes, colunasDetalhes);
        //ModeloTabela tabela3 = new ModeloTabela(linhasDeDadosPartidos, colunasPartidos);

            /*for(int i=0; i<tabela1.getRowCount(); i++){
                for(int j=0; j<tabela1.getColumnCount(); j++){
                    Object objetos1 = tabela1.getValueAt(i, j);
                    System.out.println(objetos1);
                }
            }*/
            
            /*System.out.println("\n\n");
            
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
            }*/
    }
}
