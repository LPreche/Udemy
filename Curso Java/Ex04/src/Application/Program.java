package Application;

import java.util.Scanner;

import Entities.Conta;

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
		System.out.println("Deseja fazer um deposito inicial? 1-Sim ou 2-Nao");
		Conta conta;
		do {
			op = sc.nextInt();
		}while(op != 1 && op != 2);
		
		if(op == 1) {
			System.out.println("Digite o valor do deposito inicial: ");
			valor = sc.nextDouble();
			conta = new Conta(numeroConta,titular,valor);
		}else{
			conta = new Conta(numeroConta,titular);
		}
		System.out.println("Dados da conta\nNumero da conta:"+conta.getNumeroConta()+"\tTitular:"+ conta.getTitular()+"\tSaldo:"+conta.getSaldo());
		
		System.out.println("\nDigite o valor de deposito:");
		valor = sc.nextDouble();
		conta.realizarDeposito(valor);
		System.out.println("Conta Atualizada\n");
		System.out.println("Numero da conta:"+conta.getNumeroConta()+"\tTitular:"+ conta.getTitular()+"\tSaldo:"+conta.getSaldo());
		System.out.println("\nDigite o valor do saque:");
		valor = sc.nextDouble();
		conta.realizarSaque(valor+5.00);
		System.out.println("Conta Atualizada\n");
		System.out.println("Numero da conta:"+conta.getNumeroConta()+"\tTitular:"+ conta.getTitular()+"\tSaldo:"+conta.getSaldo());
		
		sc.close();
	}
}
