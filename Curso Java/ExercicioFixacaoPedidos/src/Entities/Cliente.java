package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
    private String nome;
    private String email;
    private Date dataNasc; 

    public Cliente(String nome, String email, Date dtnasc){
        this.dataNasc = dtnasc;
        this.email = email;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDataNasc() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return format.format(dataNasc);
    }

    
}
