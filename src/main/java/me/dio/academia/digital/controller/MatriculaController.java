package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.dto.MatriculaDTO;
import me.dio.academia.digital.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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
}
