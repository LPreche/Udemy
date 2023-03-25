package Entities;

import java.sql.Date;

public class Cliente {
    private String nome;
    private String email;
    private Date dataNasc; 

    public Cliente(String nome,String email,Date dataN){
        this.nome = nome;
        this.email = email;
        this.dataNasc = dataN;
    }
}
