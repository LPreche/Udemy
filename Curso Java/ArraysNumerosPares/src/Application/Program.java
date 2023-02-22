package Application;

import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
		int n,cont=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		int[] numVet = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Digite um numero: ");
			numVet[i] = sc.nextInt();
		}
		System.out.println("Numeros Pares:");
		for(int i=0;i<n;i++) {
			int num = numVet[i] % 2 ;
			if(num == 0) {
				System.out.print(numVet[i]+" ");
				cont++;
			}
		}
		System.out.println("\nQuantidade de pares = "+cont);
	}
}
