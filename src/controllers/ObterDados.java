package controllers;

import edu.unb.fga.dadosabertos.Camara;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBException;

/**
 * Se conectar com o banco de dados aberto do governo e pegar os dados la inseridos
 * @author victor
 */
public class ObterDados extends Thread{
     
    private int threadID;
    
    public ObterDados(int ID){
        this.threadID = ID;
    }
    
    @Override
    public void run(){
        Camara camara = new Camara();
        try {
            camara.obterDados();
            JOptionPane.showMessageDialog(null, "Dados obtidos com sucesso!");
        } catch (JAXBException | IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro na obtenção dos dados!\nErro:" + ex.getMessage());
        }
    }
}
