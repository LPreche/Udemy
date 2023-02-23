package Application;

import java.util.Scanner;
import Entities.Pessoas;

public class Program {

	public static void main(String[] args) {
		int n,contF=0,contM=0;
		double mediaF=0,mediaM=0,menor=0,maior=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		Pessoas[] pessoa = new Pessoas[n];
		
		for(int i=0;i<n;i++) {
			char genero;
			
			System.out.printf("Altura da %da Pessoa: ",i);
			double altura = sc.nextDouble();
			do {
				System.out.printf("Genero da %da Pessoa: ",i);
				genero = sc.next().charAt(0);
			}while((genero != 'F')&&(genero != 'M'));
		
			pessoa[i] = new Pessoas(altura,genero);
		}
		menor = pessoa[0].getAltura();
		for(int i=0;i<n;i++) {
			if(pessoa[i].getAltura() < menor) {
				menor = pessoa[i].getAltura();
			}
			if(pessoa[i].getAltura() > maior) {
				maior = pessoa[i].getAltura();
			}
				
			if(pessoa[i].getGenero() == 'F') {
				mediaF += pessoa[i].getAltura();
				contF++;
			}else if(pessoa[i].getGenero() == 'M') {
				contM++;
			}
		}
		
		mediaF /= contF;
		
		
		System.out.printf("Menor Altura: %.2f\n",menor);
		System.out.printf("Maior Altura: %.2f\n",maior);
		System.out.printf("Media das alturas das mulheres: %.2f\n",mediaF);
		System.out.println("Numero de homens = "+contM);
	}

}
