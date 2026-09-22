package org.example.cadastroalunobackend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nome;

    @Column
    private String username;

    @Column
    private String senha;

    @Column
    private String email;

    public Admin(){}

    public Admin(String nome, String username, String senha, String email){
        this.nome = nome;
        this.username = username;
        this.senha = senha;
        this.email = email;
    }


}
