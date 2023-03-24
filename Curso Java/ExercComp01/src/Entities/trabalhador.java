package Entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import Entities.Enum.NivelTrabalhador;

public class Trabalhador {
	private String nome;
	private NivelTrabalhador nivel;
	private Double salarioBase;
	private Departamento departamento;
	private List <Contratos> list = new ArrayList<>();

	//Construtores
	public Trabalhador(String nome, NivelTrabalhador nivel, Double salarioBase, Departamento departamento) {
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

	public Double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(Double salarioBase) {
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
		this.list.add(contrato);
	}
	
	public void removerContrato(Contratos contrato){
		this.list.remove(contrato);
	}

	public double ganhos(int ano,int mes){
		double valorTotal = 0;
		List<Contratos> cont = this.list;
		Calendar cal = Calendar.getInstance();
			for(Contratos C : cont){
				Date TempData = C.getData();
				cal.setTime(TempData);
				int m = cal.get(Calendar.MONTH)+1;
				int a = cal.get(Calendar.YEAR);
				if(m == mes && a == ano){
					valorTotal += C.valorTotal();
				}
			}
		valorTotal += this.salarioBase;
		return valorTotal;
	}
}

