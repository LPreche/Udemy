package Application;

import java.util.Scanner;

import entities.Aluno;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		int i=0;
		aluno.nome = sc.nextLine();
		
		for(i=0;i<3;i++){
			aluno.notas[i] = sc.nextDouble();
			System.out.println(""+aluno.notas[i]);
		}
		
		System.out.println("FINAL GRADE = " + aluno.somaNotas());
		
		if(aluno.verificaNotaFinal() == 0)
			System.out.println("PASS");
		else{
			System.out.println("FAILED");
			System.out.println("MISSING "+aluno.verificaNotaFinal()+" POINTS");
		}
		sc.close();
	}
}
