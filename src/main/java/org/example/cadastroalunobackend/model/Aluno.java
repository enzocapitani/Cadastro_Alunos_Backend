package org.example.cadastroalunobackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
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

}
