package Application;

import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import Entities.Cliente;
import Entities.ItemPedido;
import Entities.Pedidos;
import Entities.Produto;
import Entities.Enum.OrderStatus;



public class Program {
    
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do Cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de Nascimento(DD/MM/YYYY): ");
        String data = sc.next();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = null;
        try {
            dataNascimento = sdf.parse(data);
            System.out.println(sdf.format(dataNascimento));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
        Cliente cliente = new Cliente(nome, email, dataNascimento);
       
        System.out.println("Digite os dados do pedido:");
        OrderStatus status = null;
        String Tstatus;
        do{
            sc.nextLine();
            System.out.print("Status: ");
            Tstatus = sc.nextLine();
            if(Tstatus.equals(OrderStatus.PENDENTE.toString())){
                status = OrderStatus.PENDENTE;
            }else if(Tstatus.equals(OrderStatus.PROCESSANDO.toString())){
                status = OrderStatus.PROCESSANDO;
            }else if(Tstatus.equals(OrderStatus.ENVIADO.toString())){
                status = OrderStatus.ENVIADO;
            }else if(Tstatus.equals(OrderStatus.ENTREGUE.toString())){
                status = OrderStatus.ENTREGUE;
            }
        }while(!(Tstatus.equals(OrderStatus.PENDENTE.toString()))&& !(Tstatus.equals(OrderStatus.PROCESSANDO.toString()))&& !(Tstatus.equals(OrderStatus.ENVIADO.toString()))&& !(Tstatus.equals(OrderStatus.ENTREGUE.toString())));
        
        System.out.print("Quantos produtos vai ter no pedido? " );
        int N = sc.nextInt();

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date instante = new Date(); 
        String dataHoraAtual = sdf1.format(instante);
        instante = sdf1.parse(dataHoraAtual);

        Pedidos pedido = new Pedidos(instante,status,cliente);

        
        for(int i=0;i<N;i++){
            sc.nextLine();
            System.out.println("Digite a informacao do item #"+(i+1)+":" );
            
            System.out.print("Descricao: ");
            String Pname = sc.nextLine();

            System.out.print("Preco: ");
            Double Pprice = sc.nextDouble();

            System.out.print("Quantidade: ");
            int Pquantidade = sc.nextInt();

            Produto produto = new Produto(Pname, Pprice);
            ItemPedido item = new ItemPedido(produto,Pquantidade);
            pedido.addItem(item);
        }
            
        System.out.println();
        
        System.out.println("Data e Hora do pedido: "+sdf1.format(pedido.getInstante()));
        System.out.println("Status do pedido: "+pedido.getStatus());

        Date nasc = pedido.getCliente().getDataNasc();
    
        System.out.println("Cliente: "+pedido.getCliente().getNome()+"("+sdf.format(nasc)+") - "+pedido.getCliente().getEmail());
        System.out.println("Itens do pedido:");

        List<ItemPedido> listaFinal = pedido.getList();
        for(ItemPedido T: listaFinal){
            Produto P = T.getProduto();
            System.out.println(P.getDescricao()+", "+P.getPreco()+", Quantidade: "+T.getQuantidade()+", Subtotal: $"+T.subTotal());
        }
        
        System.out.println("Valor Total: $"+pedido.total());
        
    }
}
