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

    public void addItem(ItemPedido item){
        this.list.add(item);
    }
    public void removeItem(ItemPedido item){
        this.list.remove(item);
    }
    public Double total(){
       List<ItemPedido> item = list;
       double total = ((ItemPedido) item).subTotal();
    }
}
