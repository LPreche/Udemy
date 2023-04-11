package Entities;

public class PessoaFisica extends Pessoa{
    private double gastosSaude;

    public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }
    
    @Override
    public double taxas(){
        double imposto=0;
        if(this.rendaAnual < 20000.0){
            imposto = this.rendaAnual * 0.15;
        }else if(this.rendaAnual >= 20000.00){
            imposto = this.rendaAnual * 0.25;
        }
        if(this.gastosSaude > 0 ){
            imposto -= gastosSaude * 0.5;
        }
        return imposto;
    }
}
