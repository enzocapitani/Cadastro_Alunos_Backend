package org.example.cadastroalunobackend.service;

import org.example.cadastroalunobackend.model.Aluno;
import org.example.cadastroalunobackend.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository){
        this.alunoRepository = alunoRepository;
    }

    public void adicionarAluno(Aluno aluno){
        alunoRepository.save(aluno);
    }

    public List<Aluno> verAlunos(){
        return alunoRepository.findAll();
    }

}
