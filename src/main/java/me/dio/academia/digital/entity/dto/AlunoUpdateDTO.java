package me.dio.academia.digital.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoUpdateDTO {

  private String nome;

  private String bairro;

  private LocalDate dataDeNascimento;
}
