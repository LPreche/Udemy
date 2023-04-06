package Entities;

public class Produto {
    protected String nome;
    protected double preco;
    
    public Produto(String nome,double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String valorEtiqueta(){
        return this.nome+" $ "+this.preco;
    }
}
