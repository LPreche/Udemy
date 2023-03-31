package Entities;

public class ItemPedido {
    private int quantidade;
    private Double preco;


public ItemPedido(Produto produto, int quantidade, Double preco) {
        this.quantidade = quantidade;
        this.preco = produto.getPreco();
    }

public Double subTotal(){
    return this.quantidade * this.preco;
}

}
