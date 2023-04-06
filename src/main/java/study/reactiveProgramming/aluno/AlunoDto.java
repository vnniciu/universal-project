package study.reactiveProgramming.aluno;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import static lombok.AccessLevel.PRIVATE;

@Value
@Builder
@AllArgsConstructor(access = PRIVATE)
public class AlunoDto {

  String nome;
  String nomeCurso;

  String matricula;

  String nomeCoordenador;

  public static AlunoDto toAlunoDto(Aluno aluno) {

    return AlunoDto.builder()
      .nome(aluno.getNome())
      .matricula(aluno.getMatricula())
      .nomeCoordenador(aluno.getCurso().getNomeCoordenador())
      .nomeCurso(aluno.getCurso().getNome())
      .build();
  }
}
