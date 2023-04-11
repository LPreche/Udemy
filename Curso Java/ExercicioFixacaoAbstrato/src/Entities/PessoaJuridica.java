package Entities;

public class PessoaJuridica extends Pessoa{
    private int numFuncionarios;

    public PessoaJuridica(String nome, double rendaAnual, int numFuncionarios) {
        super(nome, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public double taxas(){
        double imposto=0;

        if(this.numFuncionarios > 10){
            imposto = this.rendaAnual * 0.14;
        }else{
            imposto = this.rendaAnual * 0.16;
        }
      
        return imposto;
    }
}
