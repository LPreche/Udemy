package Application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Scanner;

import Entities.Cliente;
import Entities.ItemPedido;
import Entities.Pedidos;
import Entities.Enum.OrderStatus;



public class Program {
    public static void Main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite os dados do Cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de Nascimento(DD/MM/YYYY): ");
        String data = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = new Date(); 
        dataNascimento = sdf.parse(data);
        Cliente cliente = new Cliente(nome, email, dataNascimento);

        System.out.println("Digite os dados do pedido:");
        OrderStatus status = null;
        String Tstatus;
        do{
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
        
        System.out.print("Quantos produtos vai ter no pedido?" );
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            System.out.println("Digite a informacao do item #"+(i+1)+":" );
            System.out.print("Descricao: ");
            String Pname = sc.nextLine();
            System.out.print("preco: ");
            Double Pprice = sc.nextDouble();

            SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date instante = new Date(); 
            String dataHoraAtual = sdf1.format(instante);
            try{
                instante = sdf1.parse(dataHoraAtual);
            }catch(ParseException e){
                e.printStackTrace();
            }
            Pedidos pedido = new Pedidos(instante,status,cliente);
            ItemPedido item = new ItemPedido()
            pedido.addItem(null);
        }
    }
}
