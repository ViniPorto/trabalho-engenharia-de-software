
package entidades;

import java.util.Date;
import java.util.List;
        
public class Locacao {
    //váriáveis
    private Usuario usuario; //variável que representa relacionamento
    private List<Filme> filmes;    //variável que representa relacionamento
    private Date dataLocacao; //variável que representa atributo
    private Date dataRetorno;//variável que representa atributo
    private float valorLocacao;//variável que representa atributo
    
    //construtores
    public Locacao(){}
    
    //getters e setters

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Filme> getFilme() {
        return filmes;
    }

    public void setFilme(List<Filme> filmes) {
        this.filmes = filmes;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Date getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(Date dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }
    
    
}
