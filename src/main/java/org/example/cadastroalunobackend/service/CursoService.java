package org.example.cadastroalunobackend.service;

import org.example.cadastroalunobackend.model.Curso;
import org.example.cadastroalunobackend.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository){
        this.cursoRepository = cursoRepository;
    }

    public void adicionarCurso(Curso curso){
        cursoRepository.save(curso);
    }

    public List<Curso> retornarCursos(){
        return cursoRepository.findAll();
    }

    public List<String> retornarNomes(){
        return cursoRepository.retornarNomes();
    }

}
