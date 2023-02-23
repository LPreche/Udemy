package Application;

import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores vai ter cada vetor?");
		n = sc.nextInt();
		int[] vetA = new int[n];
		int[] vetB = new int[n];
		int[] vetC = new int[n];
		System.out.println("Digite os valores do vetor A:");
		for(int i=0;i<n;i++) {
			vetA[i] = sc.nextInt();
		}
		System.out.println("Digite os valores do vetor B:");
		for(int i=0;i<n;i++) {
			vetB[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			vetC[i] = vetA[i]+vetB[i];
		}
		System.out.println("Vetor Resultante:");
		
		for(int i=0;i<n;i++) {
			System.out.println(vetC[i]);
		}
		
	}
}
