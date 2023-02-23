package Entities;

public class Alunos{
	String nome;
	double nota;
	
	public Alunos(String nome) {
		this.nome = nome;
	}
	public Alunos(double nota) {
		this.nota = nota;
	}
	
	public String getNome() {
		return this.nome;
	}
	public double getNota() {
		return this.nota;
	}
}
