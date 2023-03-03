package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.dto.MatriculaDTO;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.repository.MatriculaRepository;
import me.dio.academia.digital.service.interfaces.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService implements IMatriculaService {
    @Autowired
    MatriculaRepository matriculaRepository;
    @Autowired
    private AlunoRepository alunoRepository;
    @Override
    public Matricula create(MatriculaDTO matriculaDTO) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(matriculaDTO.getAlunoId()).get();
        matricula.setAluno(aluno);

        return matriculaRepository.save(matricula);
    }

    @Override
    public List<Matricula> getAll() {
        return matriculaRepository.findAll();
    }

    @Override
    public Matricula get(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
