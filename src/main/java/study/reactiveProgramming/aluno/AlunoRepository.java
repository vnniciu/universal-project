package study.reactiveProgramming.aluno;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public class AlunoRepository {

  public Flux<Aluno> findAlunos() {

    return Flux.just(AlunoFactory.buildPrimeiroAluno(), AlunoFactory.buildSegundoAluno());
  }
}
