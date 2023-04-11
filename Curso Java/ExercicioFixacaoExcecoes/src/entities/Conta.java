package entities;

import exceptions.ContaException;

public class Conta {
    protected int numero;
    protected String titular;
    protected double saldo;
    protected double limiteSaque;



    public Conta(int numero,String titular,double saldo,double limiteSaque){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    

    public int getNumero() {
        return numero;
    }



    public String getTitular() {
        return titular;
    }



    public double getSaldo() {
        return saldo;
    }



    public double getLimiteSaque() {
        return limiteSaque;
    }



    public void saque(double valorSaque) throws ContaException{
       
        if(valorSaque > this.limiteSaque){
            throw new ContaException("Valor do saque acima do limite!");
        }
        
        if(valorSaque > this.saldo){
            throw new ContaException("Saldo Insuficiente!");
        }
        
        this.saldo -= valorSaque;
    }
}
