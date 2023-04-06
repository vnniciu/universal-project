package study.reactiveProgramming.aluno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/v1/alunos")
class AlunoController {

  @Autowired
  private AlunoService alunoService;

  @GetMapping
  Flux<AlunoDto> buscarAlunos() {

    return alunoService.buscarAlunos();
  }
}
