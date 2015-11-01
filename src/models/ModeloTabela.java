
package models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * Montar a tabela
 * @author victor
 */
public class ModeloTabela extends AbstractTableModel{
    
    private ArrayList linhas = null;
    private String[] colunas = null;
    
    /**
     * Construtor da classe Modelo de tabela
     * @param linhas Linhas da tabela
     * @param colunas Colunas da tabela
     */
    public ModeloTabela(ArrayList linhas, String[] colunas) {
        setLinhas(linhas);
        setColunas(colunas);
        
    }
    /**
     * Torna possivel a utilização do atributo linhas
     * @return Retorna um ArrayList com as linhas
     */
    public ArrayList getLinhas() {
        return linhas;
    }

    /**
     * Torna possivel a alteração do atributo linhas
     * @param linhas Altera o atributo linhas
     */
    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }
    
    /**
     * Torna possivel a utilização do atributo colunas
     * @return Retorna um vetor de strings com as colunas
     */
    public String[] getColunas() {
        return colunas;
    }

    /**
     * Torna possivel a alteração do atributo colunas
     * @param coluna Altera as colunas
     */
    public void setColunas(String[] coluna) {
        this.colunas = coluna;
    }
    
    /**
     * Contar o número de colunas da tabela
     * @return Retorna o número de colunas da tabela
     */
    @Override
    public int getColumnCount(){
        return colunas.length;
    }

    /**
     * Contar o número de linhas da tabela
     * @return Retorna o número de linhas da tabela
     */
    @Override
    public int getRowCount(){
        return linhas.size();
    }
    
    /**
     * Retorna o nome da coluna que está no índice passado por parâmetro.
     * @param numeroDaColuna Número da coluna que queremos o nome
     * @return Retorna o nome da coluna
     */
    @Override
    public String getColumnName(int numeroDaColuna) {
        return colunas[numeroDaColuna];
    }
    
    /**
     * Pegar o objeto que estiver na linha tal e na coluna tal da tabela
     * @param numeroDeLinhas Número da linha na tabela
     * @param numeroDeColunas Número da coluna na tabela
     * @return Retorna o objeto da linha tal e coluna tal especificados
     */
    @Override
    public Object getValueAt(int numeroDaLinhas, int numeroDaColunas){
        Object[] linha = (Object[]) getLinhas().get(numeroDaLinhas);
        return linha[numeroDaColunas];
    }
}
