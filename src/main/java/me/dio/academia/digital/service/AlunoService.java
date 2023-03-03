package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.dto.AlunoDTO;
import me.dio.academia.digital.entity.dto.AlunoUpdateDTO;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.service.interfaces.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService implements IAlunoService {

    @Autowired
    private AlunoRepository alunoRepository;
    @Override
    public Aluno create(AlunoDTO alunoDTO) {
        Aluno aluno = new Aluno();
        aluno.setNome(alunoDTO.getNome());
        aluno.setCpf(alunoDTO.getCpf());
        aluno.setBairro(alunoDTO.getBairro());
        aluno.setDataDeNascimento(alunoDTO.getDataDeNascimento());

        return alunoRepository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno update(Long id, AlunoUpdateDTO formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisica(Long id) {
        Aluno aluno = alunoRepository.findById(id).get();
        return aluno.getAvaliacoes();
    }

}
