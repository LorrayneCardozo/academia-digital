package me.dio.academia.digital.controller;

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

    @PostMapping
    public AvaliacaoFisica create(@Valid @RequestBody AvaliacaoFisicaDTO avaliacaoFisicaDTO) {
        return avaliacaoFisicaService.create(avaliacaoFisicaDTO);
    }

    @GetMapping
    public List<AvaliacaoFisica> getAll() {
        return avaliacaoFisicaService.getAll();
    }

    @GetMapping("/{id}")
    public AvaliacaoFisica get(@PathVariable Long id) {
        return avaliacaoFisicaService.get(id);
    }

    @PutMapping("/{id}")
    public AvaliacaoFisica update(@PathVariable Long id, @RequestBody AvaliacaoFisicaUpdateDTO avaliacaoFisicaUpdateDTO){
        return avaliacaoFisicaService.update(id, avaliacaoFisicaUpdateDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        avaliacaoFisicaService.delete(id);
    }
}
