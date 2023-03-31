package Entities;

import java.sql.Date;

public class Cliente {
    private String nome;
    private String email;
    private Date dataNasc; 

    public Cliente(String nome, String email, Date dtnasc){
        this.dataNasc = dtnasc;
        this.email = email;
        this.nome = nome;
    }
}
