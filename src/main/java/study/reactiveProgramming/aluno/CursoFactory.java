package study.reactiveProgramming.aluno;

public class CursoFactory {

  public static Curso buildCurso() {

    return Curso.builder()
      .nome("ADS")
      .identificador("ADS1")
      .nomeCoordenador("Coordenador")
      .build();
  }
}
