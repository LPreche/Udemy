package Entities;

import Entities.Enum.NivelTrabalhador;

public class Trabalhador {
	private String nome;
	private NivelTrabalhador nivel;
	private float salarioBase;
	private Departamento departamento;
	//Contratos = new Arraylist[];	
	//Construtores
	public Trabalhador(String nome, NivelTrabalhador nivel, float salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}


	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}
	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	//Metodos
	public void addContrato(Contratos contrato){
	
	}
	
	public void removerContrato(Contratos contrato){
	
	}
	
	public double salario(int ano,int mes){
		return 1;
	}
}

