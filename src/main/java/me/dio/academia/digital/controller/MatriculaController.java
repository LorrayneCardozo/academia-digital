package me.dio.academia.digital.controller;

import io.swagger.annotations.ApiOperation;
import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.dto.MatriculaDTO;
import me.dio.academia.digital.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
    @Autowired
    MatriculaService matriculaService;

    @ApiOperation(value = "Cria uma matrícula")
    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaDTO matriculaDTO) {
        return matriculaService.create(matriculaDTO);
    }

    @ApiOperation(value = "Retorna todas as matrículas cadastradas")
    @GetMapping
    public List<Matricula> getAll(){
        return matriculaService.getAll();
    }

    @ApiOperation(value = "Retorna uma matrícula pelo ID")
    @GetMapping("/{id}")
    public Matricula getById(@PathVariable Long id) {
        return matriculaService.get(id);
    }

    @ApiOperation(value = "Exclui uma matrícula pelo ID")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        matriculaService.delete(id);
    }

    @ApiOperation(value = "Retorna uma matrícula pelo ID do aluno")
    @GetMapping("/aluno/{id}")
    public List<Matricula> getByIdAluno(@PathVariable Long id) {
        return matriculaService.getByIdAluno(id);
    }
}
