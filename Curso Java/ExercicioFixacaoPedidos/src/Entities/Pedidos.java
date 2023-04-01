package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entities.Enum.OrderStatus;

public class Pedidos {
    private Date instante;
    private OrderStatus status;
    private List<ItemPedido> list = new ArrayList<>();
    private Cliente cliente;
    private Double total;


    public Pedidos(){

    }
    public Pedidos(Date instant, OrderStatus status, Cliente cliente){
        this.instante = instant;
        this.status = status;
        this.cliente = cliente;
    }

    
    public Date getInstante() {
        return instante;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public List<ItemPedido> getList() {
        return list;
    }
    public Cliente getCliente() {
        return cliente;
    }
 


    public void addItem(ItemPedido item){
        this.list.add(item);
    }
    public void removeItem(ItemPedido item){
        this.list.remove(item);
    }
    public Double total(){
        Double total = 0.0 ;

        for (ItemPedido I : list){
            total += I.subTotal();
        }
        this.total = total;
        return total;
    }
}
