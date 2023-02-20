package Application;
import java.util.Scanner;
public class Program {
	public static void main(String args[]) {
		int n;
		double soma=0,media=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		double[] vet = new double[n];
		
		for(int i=0;i<n;i++){
			System.out.print("Digite um numero: ");
			vet[i]= sc.nextDouble();
		}
		
		System.out.print("Valores: ");
		
		for(int i=0;i<n;i++) {
			System.out.print(vet[i]+" ");
		}
		System.out.print("\n");
		for(int i=0;i<n;i++) {
			soma +=vet[i];
			if(i==(n-1)){media=soma/n;}
		}
		
		System.out.print("Soma: " + soma);
		System.out.print("\n");
		System.out.print("Media: " + media);
		
	}
}
