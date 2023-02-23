package Application;
import java.util.Scanner;
public class Program {
	public static void main(String args[]) {
		int n,cont=0;
		double media=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		int[] vet = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
			
			if((vet[i] % 2)==0) {
				media+=vet[i];
				cont++;
			}
		}
		if(cont > 0) {
			media /= cont;
			System.out.printf("Media dos pares = %.1f",media);
		}else
			System.out.println("Nenhum numero par");
	}
}
