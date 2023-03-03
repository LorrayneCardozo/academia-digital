package me.dio.academia.digital.controller;

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

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaDTO matriculaDTO) {
        return matriculaService.create(matriculaDTO);
    }

    @GetMapping
    public List<Matricula> getAll(){
        return matriculaService.getAll();
    }

    @GetMapping("/{id}")
    public Matricula getById(@PathVariable Long id) {
        return matriculaService.get(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        matriculaService.delete(id);
    }

    @GetMapping("/aluno/{id}")
    public List<Matricula> getByIdAluno(@PathVariable Long id) {
        return matriculaService.getByIdAluno(id);
    }
}
