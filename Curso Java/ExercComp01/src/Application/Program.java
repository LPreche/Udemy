package Application;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entities.Contratos;
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
		for(int i=0;i<N;i++){
			System.out.println("Informe os dados do contrato #"+(i+1));
			System.out.print("Data (DD/MM/YYYY: ");
			String d = sc.next();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date data = new Date();
			try {
				data = sdf.parse(d);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("Valor por hora: ");
			double vHora = sc.nextDouble();
			System.out.print("Duracao(horas): ");
			int hora = sc.nextInt();
			Contratos contrato = new Contratos(data,vHora,hora);
			trabalhador.addContrato(contrato);
		}

			System.out.println("Nome: "+trabalhador.getNome());
			System.out.println("Departamento: "+trabalhador.getDepartamento().nome);

	}

}
