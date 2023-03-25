package Entities;

public class ItemPedido {
    private Produto produto;
    private int quantidade;
    private Double preco;


public ItemPedido(Produto produto, int quantidade, Double preco) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }


public Double subTotal(){
    double subtotal = this.quantidade * this.preco;
    return subtotal;
}

}
