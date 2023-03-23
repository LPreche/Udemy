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
    //Métodos
    public double valorTotal(){
        return this.valorHora * horas;
    }
}  

