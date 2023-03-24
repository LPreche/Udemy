package Entities;

import java.util.Date;

public class Contratos{
    private Date data;
    private double valorHora;
    private int horas;

    //Construtores
    public Contratos(Date data, double valorHora, int horas){
        this.data = data;
        this.valorHora = valorHora;
        this.horas = horas;
    }
    
    //getters e setters
    public Date getData() {
        return data;
    }

    //Métodos
    public double valorTotal(){
        return this.valorHora * horas;
    }

  
}  

