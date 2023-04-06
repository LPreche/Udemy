package Entities;

public class FuncionarioTercerizado extends Funcionario{
    private double valorAdicional;
    public FuncionarioTercerizado(String nome, int hours, double valorPorHora,double valorAdicional) {
        super(nome, hours, valorPorHora);
        this.valorAdicional = valorAdicional;
    }
    
    @Override
    public double pagamento(){
        double pagamento = valorAdicional * 1.1;
        pagamento += this.hours * this.valorPorHora; 
        return pagamento;
    }
}
