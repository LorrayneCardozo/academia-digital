package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
    /**
     *
     * @param id: id do aluno
     * @return matricula do aluno passado como parâmetro da função
     */
    @Query(value = "SELECT * FROM matricula " +
            "JOIN aluno ON aluno.id = matricula.aluno_id " +
            "WHERE aluno.id = :id", nativeQuery = true)
    List<Matricula> findByAlunoId(Long id);
}
