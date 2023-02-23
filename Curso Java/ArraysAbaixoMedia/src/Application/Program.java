package Application;

import java.util.Scanner;
public class Program {
	public static void main(String Args[]) {
		int n;
		double media=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		double[] vet = new double[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Digite um numero: ");
			vet[i]= sc.nextDouble();
		}
		for(int i=0;i<n;i++) {
			media += vet[i];
			if(i==(n-1)) {
				media /= n;
			}
		}
		System.out.printf("Media do vetor: %.3f\n",media);
		System.out.println("Elementos abaixo da media:");
		for(int i=0;i<n;i++) {
			if(vet[i]<media) {
				System.out.println(vet[i]);
			}
		}
		
	}
}
