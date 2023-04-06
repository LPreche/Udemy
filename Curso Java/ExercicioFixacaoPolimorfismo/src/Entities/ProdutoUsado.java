package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;


public class ProdutoUsado extends Produto{
    private Date dataFabricacao;

    public ProdutoUsado(String nome, double preco,Date dataF) {
        super(nome, preco);
        this.dataFabricacao = dataF;
    }
    
    @Override
    public String valorEtiqueta(){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return this.nome+" (used) $ "+this.preco+" (Data de Fabricacao: "+format.format(this.dataFabricacao)+")";
    }
}
