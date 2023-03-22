package Entities;

import java.util.Date;

public class Contratos{
    Date data;
    double valorHora;
    int horas;
    
    public double valorTotal(){
        return this.valorHora * horas;
    }
}  

