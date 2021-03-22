//Rogeria - 12/11/2020
package servicos;

import entidades.*;
import exceptions.*;
import java.util.Calendar;
import utils.DataUtils;
import java.util.Date;
import java.util.List;


public class ServicoLocacao {
    
    public ServicoLocacao(){}

    public Locacao alugarFilme(Usuario usuario, List<Filme> filmes) throws FilmeSemEstoqueException, LocacaoException{
        if(usuario == null){
            throw new LocacaoException("Usuário Vazio!");
        }
        
        if(filmes == null){
            throw new LocacaoException("Filme Vazio!");
        }
        
        for(Filme f:filmes){ // for(int i=0; i < filmes.size(); i++)
            if(f.getEstoque() == 0){
                throw new FilmeSemEstoqueException();
            }            
        }                
        
        Locacao locacao = new Locacao();
        
        locacao.setFilme(filmes);
        
        locacao.setUsuario(usuario);
        //calculando o valor total da locação
        float valorFilme, valorTotal = 0.0f;
        for(int i=0;i<filmes.size();i++){
            Filme filmex = filmes.get(i);
            valorFilme = filmex.getPreco();
            switch(i){
                case 2: //3ºfilme da lista, com desconto de 25%
                    valorFilme = valorFilme * 0.75f; break;
                case 3: //4º filme da lista, com desconto de 50%
                    valorFilme = valorFilme * 0.5f; break;
                case 4: //5º filme da lista, com desconto de 75%
                    valorFilme = valorFilme * 0.25f; break;
                case 5: //6º filme da lista, com desconto de 100%
                    valorFilme = valorFilme * 0f; break;                    
            }
            valorTotal = valorTotal + valorFilme; // valorTotal += valorFilme
        }
        locacao.setValorLocacao(valorTotal);
                
        Date data = new Date();
        locacao.setDataLocacao(data);
        
        Date dataEntrega = DataUtils.adicionarDias(data, 1);
        if(DataUtils.verificarDiaSemana(dataEntrega, Calendar.SUNDAY)){
            dataEntrega = DataUtils.adicionarDias(dataEntrega, 1);
        }        
        locacao.setDataRetorno(dataEntrega);
        
        return locacao;
    }

}
