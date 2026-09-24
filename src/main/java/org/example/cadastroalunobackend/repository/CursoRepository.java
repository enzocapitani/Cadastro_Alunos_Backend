package org.example.cadastroalunobackend.repository;

import org.example.cadastroalunobackend.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

    @Query("SELECT c.nome FROM Curso c ORDER BY c.nome")
    List<String> retornarNomes();

}
