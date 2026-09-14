package org.example.cadastroalunobackend.repository;

import org.example.cadastroalunobackend.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
