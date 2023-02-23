package Application;

import java.util.Locale;
import java.util.Scanner;
import Entities.Alunos;

public class Program {
	public static void main(String args[]) {
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos serao digitados? ");
		n = sc.nextInt();
		Alunos[] aluno = new Alunos[n];
		Alunos[] Asem1 = new Alunos[n];
		Alunos[] Asem2 = new Alunos[n];
		
		for(int i=0;i<n;i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %d aluno:\n", i);
			sc.nextLine();
			String nome = sc.nextLine();
			double nota = sc.nextDouble();
			Asem1[i] = new Alunos(nota);
			nota = sc.nextDouble();
			Asem2[i] = new Alunos(nota);
			aluno[i] = new Alunos(nome);
		}
		System.out.println("Alunos Aprovados:");
		for(int i=0;i<n;i++) {
			double media= (Asem1[i].getNota()+Asem2[i].getNota())/2;
			if(media>=6) {
				System.out.println(aluno[i].getNome());
			}
		}
		sc.close();
	}
}
