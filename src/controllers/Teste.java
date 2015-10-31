package controllers;

import edu.unb.fga.dadosabertos.Camara;
import edu.unb.fga.dadosabertos.Comissao;
import edu.unb.fga.dadosabertos.Deputado;
import edu.unb.fga.dadosabertos.Detalhes;
import edu.unb.fga.dadosabertos.Partido;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBException;

public class Teste {
    
    public static void main(String[] args) throws IOException {
        
        //Criar um objeto Camara
        Camara camara = new Camara();
        try {
            //Obter os dados do site do congresso
            camara.obterDados();
            JOptionPane.showMessageDialog(null, "Dados obtidos com sucesso!");
        } catch (JAXBException ex) {
            JOptionPane.showMessageDialog(null, "Erro na obtenção dos dados!\nErro:" + ex.getMessage());
        }
        
        List<Deputado> deputados = camara.getDeputados();
        
        //Agora é possivel ver os dados dos deputados
        Deputado deputado = deputados.get(0);
        System.out.println("Nome: "+ deputado.getNome());
        //System.out.println("Email: "+ deputado.getEmail());
        //System.out.println("Nome do parlamentar: " + deputado.getNomeParlamentar());
        //System.out.println("Fone: " + deputado.getFone());
        //System.out.println("Gabinete: " + deputado.getGabinete());
        //System.out.println("Anexo: " + deputado.getAnexo());
        //System.out.println("Condição: " + deputado.getCondicao());
        //System.out.println("Partido: " + deputado.getPartido());
        //System.out.println("Sexo: " + deputado.getSexo());
        //System.out.println("Uf ou Estado: " + deputado.getUf());
        //System.out.println("URL da foto: " + deputado.getUrlFoto());
        //System.out.println("ID: " + deputado.getIdeCadastro());
        //System.out.println("Matricula: "+ deputado.getMatricula());
        //System.out.println("\n");
        
       /* try {
            //Vamos baixar os detalhes dos deputados
            deputado.obterDetalhes();
            JOptionPane.showMessageDialog(null, "Detalhes obtidos com sucesso!");
        } catch (JAXBException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao obter detalhes!\nErro:" + ex.getMessage());
        }
        
        //Agora é possivel ver os detalhes do deputado
        Detalhes detalhes = deputado.getDetalhes();
        System.out.println("UF de representação atual: " + detalhes.getUfRepresentacaoAtual());
        System.out.println("Situação na legislatura atual: " + detalhes.getSituacaoNaLegislaturaAtual());
        System.out.println("Data de nascimento: " + detalhes.getDataNascimento());
        System.out.println("Data de falecimento: " + detalhes.getDataFalecimento());
        System.out.println("Número de legislatura: " + detalhes.getNumLegislatura());
        System.out.println("\n");
        
        //Agora é possivel ver os detalhes dos partidos
        Partido partido = detalhes.getPartido();
        System.out.println("ID do partido: " + partido.getIdPartido());
        System.out.println("Nome do partido: " + partido.getNome());
        System.out.println("Sigla do partido: " + partido.getSigla());
        System.out.println("\n");
        
        //Vamos agora pegar os dados da comissão
        Comissao comissao = new Comissao();
        System.out.println("Nome da comissao: " + comissao.getNomeComissao());
        System.out.println("Condição de membro: " + comissao.getCondicaoMembro());
        System.out.println("Data de entrada: " + comissao.getDataEntrada());
        System.out.println("Data de saida: " + comissao.getDataSaida());
        System.out.println("Sigla da comissao: " + comissao.getSiglaComissao());
        System.out.println("ID do orgão legislativo: " + comissao.getIdOrgaoLegislativoCD());*/
        
    }
}
