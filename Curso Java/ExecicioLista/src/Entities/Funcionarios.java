package Entities;

public class Funcionarios {
	public int id;
	public String nome;
	private double salario;
	
	public Funcionarios(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	public double getSalario() {
		return this.salario;
	}
	public void aumentarSalario(double porcentagem) {
		this.salario += (salario * (porcentagem/100))  ;
	}
}
