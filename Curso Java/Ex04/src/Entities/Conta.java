package Entities;


public class Conta{
	private int numeroConta;
	public String titular;
	private double Saldo;
	
	public Conta() {
		
	}
	public Conta(int numeroConta,String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		
	}
	
	public Conta(int numeroConta,String titular,double depositoInicial) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.Saldo += depositoInicial;
	}
	
	public int getNumeroConta() {
		return this.numeroConta;
	}
	
	public double getSaldo() {
		return this.Saldo;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getTitular() {
		return this.titular;
	}
	
	public void realizarDeposito(double valorDeposito) {
		this.Saldo += valorDeposito;
	}
	public void realizarSaque(double valorSaque) {
		this.Saldo -= valorSaque;
	}
		
}
