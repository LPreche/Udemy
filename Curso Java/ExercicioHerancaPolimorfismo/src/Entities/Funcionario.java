package Entities;

public class Funcionario {
    private String nome;
    protected int hours;
    protected double valorPorHora;


    
    public String getNome() {
        return nome;
    }

    public int getHours() {
        return hours;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public Funcionario(String nome, int hours, double valorPorHora) {
        this.nome = nome;
        this.hours = hours;
        this.valorPorHora = valorPorHora;
    }

    public double pagamento(){
        double pagamento = this.hours * this.valorPorHora;
        return pagamento;
    }
    
}
