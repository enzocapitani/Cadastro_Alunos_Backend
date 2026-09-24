package org.example.cadastroalunobackend.service;

import lombok.SneakyThrows;
import org.example.cadastroalunobackend.exceptions.alunoexception.AlunoNullException;
import org.example.cadastroalunobackend.exceptions.alunoexception.AlunoSemBairroException;
import org.example.cadastroalunobackend.exceptions.alunoexception.AlunoSemNomeException;
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

    public void adicionarAluno(Aluno aluno) {

        if(aluno == null) throw new AlunoNullException("ERRO ! Aluno vazio");

        if(aluno.getBairro() == null || aluno.getBairro().isBlank()){
            throw new AlunoSemBairroException("ERRO ! Aluno sem bairo");
        }

        if(aluno.getNome() == null || aluno.getNome().isBlank()){
            throw new AlunoSemNomeException("ERRO ! Aluno sem nome");
        }

        alunoRepository.save(aluno);

        System.out.println("Aluno "+aluno.getNome()+" enviado com sucesso para o repositório");
    }

    public List<Aluno> verAlunos(){
        return alunoRepository.retornarOrdenado();
    }

}
