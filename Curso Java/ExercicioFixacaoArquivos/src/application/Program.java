package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Produtos;

public class Program {
    public static void main(String[] args) {
        Scanner sc = null;
        File path = new File("C:\\Users\\paulo\\Documents\\GitHub\\Udemy\\Curso Java\\ExercicioFixacaoArquivos\\Files\\summary.csv");
        String pathOrigem = path.getParent();
        String TargetPath = "\\out\\";
        List<Produtos> produtos = new ArrayList<>();
    
        try(BufferedReader br = new BufferedReader(new FileReader(pathOrigem))){
            String item = br.readLine();
            //sc = new Scanner(path);
            while(item != null){
                String[] campos = item.split(",");
                Produtos produto = new Produtos(campos[0],Double.parseDouble(campos[1]),Integer.parseInt(campos[2]));
                produtos.add(produto);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(sc != null){
                sc.close();
            }
        }

        for(Produtos P: produtos){
            System.out.println(P.getNome()+", "+P.getPrecoUnitario()+", "+P.getQuantidade());
        }

    }
}
