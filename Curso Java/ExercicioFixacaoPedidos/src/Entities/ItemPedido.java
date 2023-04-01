package Entities;

public class ItemPedido {
    private int quantidade;
    private Double preco;
    private Produto produto;

public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = produto.getPreco();
    }



    
public int getQuantidade() {
    return quantidade;
}

public Double getPreco() {
    return preco;
}

public Produto getProduto() {
    return produto;
}


public Double subTotal(){
    return this.quantidade * this.preco;
}

}
