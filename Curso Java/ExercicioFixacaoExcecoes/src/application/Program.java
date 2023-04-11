package application;

import java.util.Scanner;

import entities.Conta;
import exceptions.ContaException;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        try   {
            System.out.print("Numero da Conta: ");
            int numero = sc.nextInt();
            sc.nextLine();
            System.out.print("Titular: ");
            String nome = sc.nextLine();
            System.out.print("Saldo inicial: ");
            double saldoInicial = sc.nextDouble();
            System.out.print("Limite de Saque: ");
            double limite = sc.nextDouble();

            Conta conta = new Conta(numero, nome,saldoInicial, limite);

            System.out.println("Saque:");
            System.out.print("valor a sacar: ");
            double valorSaque = sc.nextDouble();
            conta.saque(valorSaque);
            System.out.println("Saque realizado\nNovo saldo: "+conta.getSaldo());
        }
        catch(ContaException e){
            System.out.println("Erro ao sacar: "+e.getMessage());
        }
        catch(IllegalArgumentException e){
            System.out.println("Dados invalidos!");
        }
        sc.close();
    }
}
