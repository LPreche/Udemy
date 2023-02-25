package Application;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import Entities.Funcionarios;

public class Program {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		List <Funcionarios> list = new ArrayList<>();

		System.out.print("Quantos funcionarios serao cadastrados? ");
		n = sc.nextInt();
		List<Funcionarios> Afuncionario;
		for(int i=0;i<n;i++) {
			Object I;
			do {
				System.out.print("ID: ");
				int ind = sc.nextInt();
				I =  ind;
				Afuncionario = list.stream().filter(x -> x.id == ind).collect(Collectors.toList());
				if(Afuncionario.size() > 0 ) {
					System.out.println("ID ja utilizado, Digite novamente:");
				}
			}while(Afuncionario.size() > 0);
			
			int id = (int) I;
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			Funcionarios funcionario = new Funcionarios(id,nome,salario);
			list.add(funcionario);
		}
		
		System.out.print("\nDigite o codigo do funcionario que teve aumento no salario:");
		int f = sc.nextInt();
		Afuncionario = list.stream().filter(x -> x.id == f).collect(Collectors.toList());
		if(Afuncionario.size() != 0) {
			System.out.print("Digite a porcentagem:");
			double s = sc.nextDouble();
			for(Funcionarios F : Afuncionario) {
				F.aumentarSalario(s);
			}
		}else {
			System.out.println("\nFuncionario Inexistente!");
		}
		System.out.println("\nLista de funcionarios:");
		for(Funcionarios F : list) {
			System.out.println(F.id+", "+F.nome+", "+F.getSalario());
		}
		sc.close();
		
	}

}
