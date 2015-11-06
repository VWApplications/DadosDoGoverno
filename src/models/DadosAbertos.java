/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import edu.unb.fga.dadosabertos.Deputado;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author victor
 */
public class DadosAbertos {

    public static ArrayList linhasDeDadosDeputados;
    public static ArrayList linhasDeDadosDetalhes;
    public static ArrayList linhasDeDadosPartidos;
    public static List<Deputado> deputados;
    public static ModeloTabela tabelaDeputados;
    public static ModeloTabela tabelaPartidos;
    public String pesquisarDeputados;

    public DadosAbertos(){
        
    }

    public static ModeloTabela getTabelaDeputados() {
        return tabelaDeputados;
    }

    public static void setTabelaDeputados(ModeloTabela tabelaDeputados) {
        DadosAbertos.tabelaDeputados = tabelaDeputados;
    }

    public static ModeloTabela getTabelaPartidos() {
        return tabelaPartidos;
    }

    public static void setTabelaPartidos(ModeloTabela tabelaPartidos) {
        DadosAbertos.tabelaPartidos = tabelaPartidos;
    }


    public static List<Deputado> getDeputados() {
        return deputados;
    }

    public static void setDeputados(List<Deputado> deputados) {
        DadosAbertos.deputados = deputados;
    }
    
    public static ArrayList getLinhasDeDadosDeputados() {
        return linhasDeDadosDeputados;
    }

    public static void setLinhasDeDadosDeputados(ArrayList linhasDeDadosDeputados) {
        DadosAbertos.linhasDeDadosDeputados = linhasDeDadosDeputados;
        
    }

    public static ArrayList getLinhasDeDadosDetalhes() {
        return linhasDeDadosDetalhes;
    }

    public static void setLinhasDeDadosDetalhes(ArrayList linhasDeDadosDetalhes) {
        DadosAbertos.linhasDeDadosDetalhes = linhasDeDadosDetalhes;
    }

    public static ArrayList getLinhasDeDadosPartidos() {
        return linhasDeDadosPartidos;
    }

    public static void setLinhasDeDadosPartidos(ArrayList linhasDeDadosPartidos) {
        DadosAbertos.linhasDeDadosPartidos = linhasDeDadosPartidos;
    }

    public String getPesquisarDeputados() {
        return pesquisarDeputados;
    }

    public void setPesquisarDeputados(String pesquisarDeputados) {
        this.pesquisarDeputados = pesquisarDeputados;
    }

    
}
