package Application;

import Entities.Pessoa;
import Entities.PessoaFisica;
import Entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        int N;
        Scanner sc = new Scanner(System.in);
        List<Pessoa> contribuintes = new ArrayList<>();
        System.out.print("Digite o numero de contribuiente: ");
        N = sc.nextInt();
        for(int i = 0; i < N ; i++){
            System.out.println("Dados do Contribuinte #"+(i+1));
            System.out.print("Pessoa Fisica ou Juridica? ");
            char c;
            do{
                c = sc.next().charAt(0);
            }while(c != 'f' && c != 'j');
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Renda Anual: ");
            double rendaAnual = sc.nextDouble();
            if(c == 'f'){
                System.out.print("gastos com saude: ");
                double gastosSaude = sc.nextDouble();
                Pessoa pessoaFisica = new PessoaFisica(nome, rendaAnual, gastosSaude);
                contribuintes.add(pessoaFisica); 
            }else if(c == 'j'){
                System.out.print("Numero de Funcionarios: ");
                int nFuncionarios = sc.nextInt();
                Pessoa pessoaJuridica = new PessoaJuridica(nome, rendaAnual, nFuncionarios);
                contribuintes.add(pessoaJuridica);
            }
            
        }
        System.out.println("Contribuites: ");
        double totalImpostos= 0 ;
        for(Pessoa C : contribuintes){
            System.out.println(C.getNome()+" $ "+C.taxas());
            totalImpostos += C.taxas();
        }
        System.out.println("Impostos Totais: $ "+totalImpostos);
    }
}
