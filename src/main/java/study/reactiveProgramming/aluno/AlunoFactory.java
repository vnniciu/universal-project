package study.reactiveProgramming.aluno;

public class AlunoFactory {

  public static Aluno buildPrimeiroAluno() {

    return Aluno.builder()
      .nome("Joao")
      .curso(CursoFactory.buildCurso())
      .matricula("123")
      .build();
  }

  public static Aluno buildSegundoAluno() {

    return Aluno.builder()
      .nome("Teste")
      .curso(CursoFactory.buildCurso())
      .matricula("345")
      .build();
  }
}
