package controllers;

import edu.unb.fga.dadosabertos.Deputado;
import edu.unb.fga.dadosabertos.Detalhes;
import edu.unb.fga.dadosabertos.Partido;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBException;
import models.ModeloTabela;

public class ControleTabela extends JFrame{
    
        public static ModeloTabela criarTabelaDeputado(List<Deputado> deputados){
        ArrayList linhasDeDados = new ArrayList();
        String[] colunas = new String[]{"Nome", "Partido", "Estado", "Email", "Telefone", "Condição"};
        
        for(Deputado deputado: deputados){
            linhasDeDados.add(new Object[]{deputado.getNome(),deputado.getPartido(),
                                           deputado.getUf(), deputado.getEmail(),
                                           deputado.getFone(), deputado.getCondicao()});
        }
        
        ModeloTabela tabela = new ModeloTabela(linhasDeDados, colunas);
        return tabela;
    }
        
    public static ModeloTabela criarTabelaPartido(List<Deputado> deputados){
        ArrayList linhasDeDados = new ArrayList();
        String[] colunas = new String[]{"ID", "Sigla", "Nome"};
        
        Deputado deputado = new Deputado();
        
        try {
            deputado.obterDetalhes();
        } catch (IOException | JAXBException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao obter detalhes!\nErro:" + ex.getMessage());
        }
        
        Detalhes detalhes = deputado.getDetalhes();
        Partido partido = detalhes.getPartido();
        
        linhasDeDados.add(new Object[]{partido.getIdPartido()});
        linhasDeDados.add(new Object[]{partido.getSigla()});
        linhasDeDados.add(new Object[]{partido.getNome()});
        
        ModeloTabela tabela = new ModeloTabela(linhasDeDados, colunas);
        return tabela;
    }
}
