package me.dio.academia.digital.controller;

import io.swagger.annotations.ApiOperation;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.dto.AvaliacaoFisicaDTO;
import me.dio.academia.digital.entity.dto.AvaliacaoFisicaUpdateDTO;
import me.dio.academia.digital.service.AvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaService avaliacaoFisicaService;

    @ApiOperation(value = "Cria uma avaliação física")
    @PostMapping
    public AvaliacaoFisica create(@Valid @RequestBody AvaliacaoFisicaDTO avaliacaoFisicaDTO) {
        return avaliacaoFisicaService.create(avaliacaoFisicaDTO);
    }

    @ApiOperation(value = "Retorna todas as avaliações físicas")
    @GetMapping
    public List<AvaliacaoFisica> getAll() {
        return avaliacaoFisicaService.getAll();
    }

    @ApiOperation(value = "Retorna uma avaliação física pelo ID")
    @GetMapping("/{id}")
    public AvaliacaoFisica get(@PathVariable Long id) {
        return avaliacaoFisicaService.get(id);
    }

    @ApiOperation(value = "Atualiza uma avaliação física pelo ID")
    @PutMapping("/{id}")
    public AvaliacaoFisica update(@PathVariable Long id, @RequestBody AvaliacaoFisicaUpdateDTO avaliacaoFisicaUpdateDTO){
        return avaliacaoFisicaService.update(id, avaliacaoFisicaUpdateDTO);
    }

    @ApiOperation(value = "Exclui uma avaliação física pelo ID")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        avaliacaoFisicaService.delete(id);
    }
}
