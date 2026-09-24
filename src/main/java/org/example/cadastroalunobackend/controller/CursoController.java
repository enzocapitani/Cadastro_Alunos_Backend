package org.example.cadastroalunobackend.controller;

import org.example.cadastroalunobackend.model.Curso;
import org.example.cadastroalunobackend.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cursos")
@CrossOrigin("http://localhost:4200")
@RestController
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService){
        this.cursoService = cursoService;
    }

    @PostMapping
    public void criarCurso(@RequestBody Curso curso){
        cursoService.adicionarCurso(curso);
    }

    @GetMapping
    public List<Curso> retornarAlunos(){
        return cursoService.retornarCursos();
    }

    @GetMapping("/nome")
    public List<String> retornarNomes(){
        return cursoService.retornarNomes();
    }

}