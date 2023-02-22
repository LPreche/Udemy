package Application;

import java.util.Scanner;

import Entities.Pessoas;


public class Program {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		double mediaAltura=0,qtdMenores;
		int n,cont=0;
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		Pessoas[] pessoa = new Pessoas[n];
		
		for(int i=0;i<n;i++) {
			pessoa[i] = new Pessoas();
			System.out.printf("Dados da %da pessoa:\n",i+1);
			System.out.print("Nome: ");
			pessoa[i].nome = sc.next();
			System.out.print("Idade: ");
			pessoa[i].idade = sc.nextInt();
			System.out.print("Altura: ");
			pessoa[i].altura = sc.nextDouble();
		}
		
		for(int i=0;i<n;i++) {
			mediaAltura+= pessoa[i].altura;
			if(pessoa[i].idade < 16) {cont++;}
			if(i==(n-1)) {mediaAltura /= n;}
		}
			
		qtdMenores = cont * 100;
		qtdMenores /= n; 
		System.out.printf("Altura Media:%.2f\n",mediaAltura);
		System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n",qtdMenores);
		for(int i=0;i<n;i++) {
			if(pessoa[i].idade < 16) {
				System.out.println(pessoa[i].nome);
			}
		}
	}
}
