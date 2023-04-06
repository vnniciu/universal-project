package study.reactiveProgramming.aluno;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import static lombok.AccessLevel.PRIVATE;

@Builder
@Value
@AllArgsConstructor(access = PRIVATE)
public class Curso {

  String nome;

  String identificador;

  String nomeCoordenador;

}
