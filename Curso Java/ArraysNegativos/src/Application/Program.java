package Application;

import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
		 int n,i;
		 System.out.print("Quantos numeros você vai digitar? ");
		 Scanner sc = new Scanner(System.in);
		 do{
			 n = sc.nextInt();
		 }while(n<0 || n>10);
		 
		 int[] numVet = new int[n];
		 
		 for(i=0;i<n;i++) {
			 System.out.print("Digite um numero:");
			 numVet[i] = sc.nextInt();
			
		 }
		 
		 for(i=0;i<n;i++) {
			 if(numVet[i]<0) {
				 System.out.println(numVet[i]+" ");
			 }
		 }
	}
}
