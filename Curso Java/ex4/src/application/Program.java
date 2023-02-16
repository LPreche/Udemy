package application;

import java.util.Scanner;

import entities.Conta;

public class Program {
	public static void main(String[] args) {
		int numeroConta, op;
		String titular;
		double valor;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero da conta: ");
		numeroConta = sc.nextInt();
		System.out.println("Digite o nome do titular da conta: ");
		titular = sc.next();
		System.out.println("Deseja fazer um deposito inicial? 1-Sim ou 2-Não");
		do {
			op = sc.nextInt();
		}while(op != 1 && op != 2);
		
		if(op == 1) {
			System.out.println("Digite o valor do deposito inicial: ");
			valor = sc.nextDouble();
			Conta conta = new Conta(numeroConta,titular,valor);
		}else {
			Conta conta = new Conta(numeroConta,titular);
		}
		
		System.out.println("Dados da conta:\n"+ conta.getNumeroConta);
		
		sc.close();
	}
}
