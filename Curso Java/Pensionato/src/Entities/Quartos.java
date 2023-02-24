package Entities;
import Entities.Alunos;

public class Quartos {
	int numero;
	Alunos aluno;
	public Quartos(int numero) {
		this.numero = numero;
	}
	public Quartos(int numero, Alunos aluno) {
		this.numero = numero;
		this.aluno = aluno;
	}
	public Alunos getAluno() {
		return this.aluno;
	}
	public void setAluno(Alunos aluno) {
		this.aluno = aluno;
	}
	
}
