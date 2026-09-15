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

    @Column
    private String curso;

    @Column
    private LocalDate dataNascimento;

    protected Aluno(){}

    public Aluno(String nome, String bairro, String curso, LocalDate dataNascimento){
        this.nome = nome;
        this.bairro = bairro;
        this.curso = curso;
        this.dataNascimento = dataNascimento;
    }

}
