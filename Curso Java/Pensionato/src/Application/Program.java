package Application;
	
	import java.util.Scanner;
	import Entities.Alunos;
	import Entities.Quartos;
	
public class Program {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Quartos[] quarto = new Quartos[10];
		for(int i=0;i<10;i++) {
			quarto[i] = new Quartos(i);
		}
		System.out.print("Quantos alunos irao fazer reserva? ");
		do {
			n = sc.nextInt();
		}while((n<1)&&(n>10));
		Alunos[] aluno = new Alunos[n];
		sc.nextLine();
		for(int i=0;i<n;i++) {
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			aluno[i] = new Alunos(nome,email);
			System.out.print("Numero do quarto: ");
			int numero = sc.nextInt();
			quarto[numero].setAluno(aluno[i]);
		}
		
		for(int i=0;i<10;i++) {
			if(quarto[i].getAluno() != null) {
				System.out.print(i+": " +quarto[i].getAluno().getNome()+","+quarto[i].getAluno().getEmail());
			}
		}
	}

}
