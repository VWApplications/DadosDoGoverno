
package controllers;

import java.util.ArrayList;
import models.DadosAbertos;
import models.ModeloDeputados;
import models.ModeloTabela;

public class ControleDePesquisa {
    
    public static ModeloTabela pesquisarDeputado(ModeloDeputados modelo){
        
        ModeloTabela tabelaDeputados = DadosAbertos.getTabelaDeputados(); 
        String pesquisaNome = modelo.getPesquisarDeputados();
        ArrayList<String> dados = new ArrayList<>();
        String[] colunas = new String[]{"Nome","Partido","Estado","Email","Telefone","Condição",
                                        "sexo", "ID de cadastro", "Matricula", "Nome Parlamentar", 
                                        "Gabinete", "Anexo", "Link da foto", "UF", "Legislatura", 
                                        "Data de nascimento", "Data de falecimento", "Número de legislatura"};
        
        //Verificar se o usuario digitou algo
        if(modelo.getPesquisarDeputados().length() > 0){
            //Percorrer todas as linhas da tabela
            for(int i = 0; i<tabelaDeputados.getRowCount(); i++){  
                    //Se o nome a pesquisar for igual ao nome da tabela
                    if(pesquisaNome.toUpperCase().equals(tabelaDeputados.getValueAt(i, 0))){
                        for(int j=0; j<tabelaDeputados.getColumnCount(); j++){
                            dados.add((String) tabelaDeputados.getValueAt(i, j));
                        }
                    }
            }
        }else{
            return tabelaDeputados;
        }
        ModeloTabela tabela = new ModeloTabela(dados, colunas);
        return tabela;
    }
}

