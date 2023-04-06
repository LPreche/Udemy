package Entities;

public class ProdutoImportado extends Produto {
    private double taxaAlfandega;

    public ProdutoImportado(String nome, double preco,double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }
    
    @Override
    public String valorEtiqueta(){
        double total = this.preco + this.taxaAlfandega;
        return this.nome+" $ "+total+" (Taxa Alfandega: $ "+this.taxaAlfandega+")";
    }
}
