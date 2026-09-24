package org.example.cadastroalunobackend.repository;

import org.example.cadastroalunobackend.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    @Query("SELECT a FROM Aluno a ORDER BY a.nome, a.curso")
    List<Aluno> retornarOrdenado();

}
