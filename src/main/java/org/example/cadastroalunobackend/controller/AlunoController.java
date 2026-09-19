package org.example.cadastroalunobackend.controller;

import org.example.cadastroalunobackend.model.Aluno;
import org.example.cadastroalunobackend.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/alunos")
@RestController
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping
    public void adicionarAluno(@RequestBody Aluno aluno){
        alunoService.adicionarAluno(aluno);
    }

    @GetMapping
    public List<Aluno> verAlunos(){
        return alunoService.verAlunos();
    }

}
