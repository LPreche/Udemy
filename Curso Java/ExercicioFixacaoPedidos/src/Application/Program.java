package Application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import Entities.Enum.OrderStatus;



public class Program {
    public static void Main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Client Data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth Date(DD/MM/YYYY): ");
        String data = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = new Date(); 
        try{
            dataNascimento = sdf.parse(data);
        }catch(ParseException e){
            e.printStackTrace();
        }
        System.out.println("Enter Order data:");
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
        
        System.out.print("How many items to this order?" );
        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            System.out.print("Product Name: ");
            String Pname = sc.nextLine();
            System.out.print("Product Price: ");
            Double Pprice = sc.nextDouble();
        }
    }
}
