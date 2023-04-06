package study.reactiveProgramming.aluno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class AlunoService {

  @Autowired
  private AlunoRepository alunoRepository;

  public Flux<AlunoDto> buscarAlunos() {

    return alunoRepository.findAlunos()
      .map(AlunoDto::toAlunoDto)
      .cache();
  }
}
