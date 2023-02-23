package Entities;

public class Pessoas {
	double altura;
	char genero;
	
	public Pessoas(double alt, char gen) {
		this.altura = alt;
		this.genero = gen;
	}
	
	public double getAltura() {
		return this.altura;
	}
	public char getGenero() {
		return this.genero;
	}
}
