package entities;

public class Aluno {
	public String nome;
	public double[] notas = new double[3];
	
	public double somaNotas() {
		return notas[0]+notas[1]+notas[2];
	}
	
	public double verificaNotaFinal() {
		if(this.somaNotas() >= 60) 
			return 0;
		else
			return 60 - this.somaNotas();
	}
}

