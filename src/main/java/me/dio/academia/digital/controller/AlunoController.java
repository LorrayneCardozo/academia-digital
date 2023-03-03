package me.dio.academia.digital.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.dto.AlunoDTO;
import me.dio.academia.digital.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;

    @ApiOperation(value = "Cria um aluno")
    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoDTO alunoDTO){
        return alunoService.create(alunoDTO);
    }

    @ApiOperation(value = "Retorna todos os alunos")
    @GetMapping
    public List<Aluno> getAll() {
        return alunoService.getAll();
    }

    @ApiOperation(value = "Retorna todas as avaliações físicas de um aluno específico")
    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisica(@PathVariable Long id) {
        return alunoService.getAllAvaliacaoFisica(id);
    }
}
