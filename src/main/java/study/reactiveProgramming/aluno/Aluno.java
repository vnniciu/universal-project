package study.reactiveProgramming.aluno;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import static lombok.AccessLevel.PRIVATE;

@Value
@Builder
@AllArgsConstructor(access = PRIVATE)
public class Aluno {

  String nome;
  String matricula;
  Curso curso;

}
