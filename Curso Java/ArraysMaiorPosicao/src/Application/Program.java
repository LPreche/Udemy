package Application;

import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
		int n,posMaior=0;
		double maior;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		double[] vet = new double[n];
		for(int i=0;i<n;i++) {
			System.out.print("DIgite um numero: ");
			vet[i] = sc.nextDouble();
		}
		maior = vet[0];
		for(int i=1;i<n;i++) {
			if(vet[i]>maior) {
				maior=vet[i];
				posMaior=i;
			}
		}
		System.out.println("Maior Valor = "+maior);
		System.out.print("Posicao do maior valor = "+posMaior);
	}
}
