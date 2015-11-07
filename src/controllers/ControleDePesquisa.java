
package controllers;

import java.util.ArrayList;
import models.DadosAbertos;
import models.ModeloDeputados;
import models.ModeloTabela;

public class ControleDePesquisa {
    
    public static ModeloTabela pesquisarDeputado(ModeloDeputados modelo){
        
        ModeloTabela tabelaDeputados = DadosAbertos.getTabelaDeputados(); 
        String pesquisaNome = modelo.getPesquisarDeputados();
        ArrayList<Object> dados = new ArrayList<>();
        String[] colunas = new String[]{"Nome","Partido","Estado","Email","Telefone","Condição",
                                        "sexo", "ID de cadastro", "Matricula", "Nome Parlamentar", 
                                        "Gabinete", "Anexo", "Link da foto", "UF", "Legislatura", 
                                        "Data de nascimento", "Data de falecimento", "Número de legislatura"};
        
        //Verificar se o usuario digitou algo
        if(pesquisaNome.length() > 0){
            //Percorrer todas as linhas da tabela
            for(int i = 0; i<tabelaDeputados.getRowCount(); i++){  
                    //Se o nome a pesquisar for igual ao nome da tabela, trocar o if
                    //Comparable vs Comparator
                    if(pesquisaNome.toUpperCase().equals(tabelaDeputados.getValueAt(i, 0))){
                            Object nome = tabelaDeputados.getValueAt(i, 0);
                            Object partido = tabelaDeputados.getValueAt(i, 1);
                            Object estado = tabelaDeputados.getValueAt(i, 2);
                            Object email = tabelaDeputados.getValueAt(i, 3);
                            Object telefone = tabelaDeputados.getValueAt(i, 4);
                            Object condicao = tabelaDeputados.getValueAt(i, 5);
                            Object sexo = tabelaDeputados.getValueAt(i, 6);
                            Object IDCadastro = tabelaDeputados.getValueAt(i, 7);
                            Object matricula = tabelaDeputados.getValueAt(i, 8);
                            Object nomeParlamentar = tabelaDeputados.getValueAt(i, 9);
                            Object gabinete = tabelaDeputados.getValueAt(i, 10);
                            Object anexo = tabelaDeputados.getValueAt(i, 11);
                            Object linkFoto = tabelaDeputados.getValueAt(i, 12);
                            Object UF = tabelaDeputados.getValueAt(i, 13);
                            Object legislatura = tabelaDeputados.getValueAt(i, 14);
                            Object dataNascimento = tabelaDeputados.getValueAt(i, 15);
                            Object dataMorte = tabelaDeputados.getValueAt(i, 16);
                            Object numeroLegislatura = tabelaDeputados.getValueAt(i, 17);
                            
                            dados.add(new Object[]{nome, partido, estado, email, telefone, condicao, sexo,
                                                   IDCadastro, matricula, nomeParlamentar, gabinete, anexo,
                                                   linkFoto, UF, legislatura, dataNascimento, dataMorte, numeroLegislatura});
                    }
            }
                ModeloTabela tabela = new ModeloTabela(dados, colunas);
                return tabela;
        }else{
                return tabelaDeputados;
        }
    }
}

