
package entidades;

public class Filme {
    //atributos
    private String nome;
    private int estoque;
    private float preco;

    //contrutores
    public Filme(){}
    
    public Filme(String nome, int estoque, float preco) {
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
    }
    
    //getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
}
