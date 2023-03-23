package Application;

import java.util.Scanner;

import Entities.Departamento;
import Entities.Trabalhador;
import Entities.Enum.NivelTrabalhador;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		Departamento departamento = new Departamento();
		
		System.out.print("Insira o nome do departamento: ");
		departamento.nome = sc.nextLine();
		System.out.println("Insira os dados do trabalhado:");
		System.out.print("Nome: ");
		String Tnome = sc.nextLine();
		String Tnivel;
		NivelTrabalhador nivel = null;
		do{
			System.out.print("Nivel: ");
			Tnivel = sc.nextLine();	
			if(Tnivel.equals(NivelTrabalhador.JUNIOR.toString())){
				nivel = NivelTrabalhador.JUNIOR;
			}else if(Tnivel.equals(NivelTrabalhador.PLENO.toString())){
				nivel = NivelTrabalhador.PLENO;
			}else if(Tnivel.equals(NivelTrabalhador.JUNIOR.toString())){
				nivel = NivelTrabalhador.SENIOR;
			}
		}while(!(Tnivel.equals(NivelTrabalhador.JUNIOR.toString())) && !(Tnivel.equals(NivelTrabalhador.PLENO.toString())) && !(Tnivel.equals(NivelTrabalhador.SENIOR.toString())));
		System.out.println("Salario Base: ");
		double TsalarioB = sc.nextDouble();
		System.out.print("Quantidade de contratos: ");
		N = sc.nextInt();
		Trabalhador trabalhador = new Trabalhador(Tnome,nivel,TsalarioB,departamento);

	}

}
