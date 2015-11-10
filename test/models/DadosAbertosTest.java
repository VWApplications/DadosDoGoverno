package models;

import edu.unb.fga.dadosabertos.Camara;
import edu.unb.fga.dadosabertos.Deputado;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author victor
 */
public class DadosAbertosTest {
    
    List<Deputado> deputados;
    
    public DadosAbertosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTabelaDeputados method, of class DadosAbertos.
     */
    @Test
    public void testGetTabelaDeputados() {
        System.out.println("getTabelaDeputados");
        
                Camara camara = new Camara();
                try {
                    camara.obterDados();
                } catch (JAXBException | IOException ex) {
                    JOptionPane.showMessageDialog(null, "Erro na obtenção dos dados!\nErro:" + ex.getMessage());
                }
                deputados = camara.getDeputados();

                ArrayList linhasDeDados = new ArrayList();
                String[] colunas = new String[]{"Nome","Partido","Estado","Email","Telefone","Condição"};

                for(Deputado deputado: deputados){

                    linhasDeDados.add(new Object[]{deputado.getNome(),deputado.getPartido(),
                                                   deputado.getUf(), deputado.getEmail(), deputado.getFone(),
                                                   deputado.getCondicao()});


                }
                ModeloTabela tabela = new ModeloTabela(linhasDeDados, colunas);
                DadosAbertos.setTabelaDeputados(tabela);
                
                ModeloTabela tabelaResult = DadosAbertos.getTabelaDeputados();
                Object result = tabelaResult.getValueAt(0, 0);
                assertEquals("ROSANGELA APARECIDA DA SILVA BARROS", result);


    }

    /**
     * Test of setTabelaDeputados method, of class DadosAbertos.
     */
    @Test
    public void testSetTabelaDeputados() {
                Camara camara = new Camara();
                try {
                    camara.obterDados();
                } catch (JAXBException | IOException ex) {
                    JOptionPane.showMessageDialog(null, "Erro na obtenção dos dados!\nErro:" + ex.getMessage());
                }
                deputados = camara.getDeputados();

                ArrayList linhasDeDados = new ArrayList();
                String[] colunas = new String[]{"Nome","Partido","Estado","Email","Telefone","Condição"};

                for(Deputado deputado: deputados){

                    linhasDeDados.add(new Object[]{deputado.getNome(),deputado.getPartido(),
                                                   deputado.getUf(), deputado.getEmail(), deputado.getFone(),
                                                   deputado.getCondicao()});


                }
                ModeloTabela tabela = new ModeloTabela(linhasDeDados, colunas);
                DadosAbertos.setTabelaDeputados(tabela);
                
                ModeloTabela tabelaResult = DadosAbertos.getTabelaDeputados();
                Object result = tabelaResult.getValueAt(0, 0);
                assertEquals("ROSANGELA APARECIDA DA SILVA BARROS", result);
    }

    /**
     * Test of getTabelaPartidos method, of class DadosAbertos.
     */
    @Test
    public void testGetTabelaPartidos() {

    }

    /**
     * Test of setTabelaPartidos method, of class DadosAbertos.
     */
    @Test
    public void testSetTabelaPartidos() {

    }

    /**
     * Test of getDeputados method, of class DadosAbertos.
     */
    @Test
    public void testGetDeputados() {
        Camara camara = new Camara();
                try {
                    camara.obterDados();
                } catch (JAXBException | IOException ex) {
                    JOptionPane.showMessageDialog(null, "Erro na obtenção dos dados!\nErro:" + ex.getMessage());
                }
        deputados = camara.getDeputados();
        
        String nome = deputados.get(0).getNome();
        
        assertEquals("ROSANGELA APARECIDA DA SILVA BARROS", nome);
    }

    /**
     * Test of setDeputados method, of class DadosAbertos.
     */
    @Test
    public void testSetDeputados() {
        Camara camara = new Camara();
                try {
                    camara.obterDados();
                } catch (JAXBException | IOException ex) {
                    JOptionPane.showMessageDialog(null, "Erro na obtenção dos dados!\nErro:" + ex.getMessage());
                }
        deputados = camara.getDeputados();
        
        deputados.get(0).setNome("Victor Arnaud");
        
        String nome = deputados.get(0).getNome();
        
        assertEquals("Victor Arnaud", nome);
    }
}
