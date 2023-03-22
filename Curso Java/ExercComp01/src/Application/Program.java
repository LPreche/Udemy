package Application;

import java.util.Scanner;

import Entities.Departamento;
import Entities.Trabalhador;
import Entities.Enum.NivelTrabalhador;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;

		N = sc.nextInt();

		Departamento departamento = new Departamento();
		
		System.out.print("Insira o nome do departamento: ");
		departamento.nome = sc.nextLine();
		System.out.println("Insira os dados do trabalhado:");
		System.out.print("Nome: ");
		String Tnome = sc.nextLine();
		do{
			System.out.print("Nivel: ");
			String Tnivel = sc.nextLine();
			Tnivel.compareTo(NivelTrabalhador.JUNIOR.toString());
		}
		Trabalhador trabalhador = new Trabalhador(Tnome,Tnivel,TsalarioB,departamento);

	}

}
