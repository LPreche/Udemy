package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entities.Funcionario;
import Entities.FuncionarioTercerizado;
public class Program {
    public static void main(String[] args){
        
        int N;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de funcionarios: ");
        N = sc.nextInt();
        List<Funcionario> funcionarios = new ArrayList<>();
        for(int i = 0;i < N;i++){
            System.out.println("Dados do Funcionarios #"+(i+1)+":");
            System.out.print("Tercerizado(s/n)? ");
            char terc;
            do{
                terc = sc.next().charAt(0);
            }while(terc != 's' && terc != 'n');
            sc.nextLine();//flush

            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Valor por hora: ");
            double vhoras = sc.nextDouble();

            if(terc == 's'){
                System.out.print("Valor Adicional: ");
                double vAdicional = sc.nextDouble();
                Funcionario f = new FuncionarioTercerizado(nome, horas, vhoras, vAdicional);
                funcionarios.add(f);
            }else{
                Funcionario f = new Funcionario(nome, horas, vhoras);
                funcionarios.add(f);
            }
                
        }   

        System.out.println("Pagamentos:");
        for(Funcionario F : funcionarios){
            System.out.println(F.getNome()+" - $ "+F.pagamento());
        }
    }

}
