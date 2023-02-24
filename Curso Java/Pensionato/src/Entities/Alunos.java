package Entities;

public class Alunos {
	String nome, email;
	public Alunos() {
		
	}
	public Alunos(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	public String getNome() {
		return this.nome;
	}
	public String getEmail() {
		return this.email;
	}
}
