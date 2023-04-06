package Application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Produto;
import Entities.ProdutoImportado;
import Entities.ProdutoUsado;

public class Program {
    public static void main(String[] args) throws ParseException{
        int N;
        Scanner sc = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        System.out.print("Digite o numero de produtos: ");
        N = sc.nextInt();
        char c = ' ';
        for(int i = 0;i < N;i++){
            System.out.println("Informação do produto #"+(i+1)+": ");
            System.out.print("Normal, usado ou importado (n/u/i)? ");
            
            do{
                c = sc.next().charAt(0);
            }while(c != 'n' && c != 'u' && c != 'i');
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Preco: ");
            double preco = sc.nextDouble();
            if(c == 'i'){
                System.out.print("Taxa Alfandega: ");
                double taxa = sc.nextDouble();
                Produto p = new ProdutoImportado(nome, preco, taxa);
                produtos.add(p);
            }else if(c == 'u'){
                sc.nextLine();
                System.out.print("Data de Fabricacao (dd/mm/yyyy): ");
                String dataF = sc.nextLine();
                SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
                Date d = s.parse(dataF);
                Produto p = new ProdutoUsado(nome, preco,d);
                produtos.add(p);
            }else{
                Produto p = new Produto(nome, preco);
                produtos.add(p);
            }
        }

        for(Produto P : produtos){
            System.out.println(P.valorEtiqueta());
        }
    }

}