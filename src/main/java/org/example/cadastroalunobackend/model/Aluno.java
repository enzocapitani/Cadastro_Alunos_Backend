package org.example.cadastroalunobackend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter @Setter
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String bairro;

    @Column(nullable = false)
    private String curso;

    @Column(nullable = false)
    private LocalDate data_nascimento;

    protected Aluno(){}

    public Aluno(String nome, String bairro, String curso, LocalDate data_nascimento){
        this.nome = nome;
        this.bairro = bairro;
        this.curso = curso;
        this.data_nascimento = data_nascimento;
    }

}
