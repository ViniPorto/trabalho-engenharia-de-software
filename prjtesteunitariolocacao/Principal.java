
package prjtesteunitariolocacao;

import servicos.ServicoLocacao;
import entidades.*;
import utils.DataUtils;
import java.util.Date;

public class Principal {


    public static void main(String[] args) {
        //CENÁRIO
        ServicoLocacao servico = new ServicoLocacao();
        Usuario user = new Usuario("user1");
        Filme film = new Filme("filme1", 10, 5.00f);
        
        //AÇÃO     
        Locacao locacao = servico.alugarFilme(user, film);
       
        //VERIFICAÇÃO DO RESULTADO
    
        System.out.println(locacao.getValorLocacao() == 5.00f);
        System.out.println(locacao.getFilme().getNome().equals("filme1"));
        System.out.println(locacao.getUsuario().getNome().equals("user1"));
        System.out.println(DataUtils.isMesmaData(locacao.getDataLocacao(),new Date()));
        System.out.println(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(2)));        
        // Verificação do resultado
    }
    
}
