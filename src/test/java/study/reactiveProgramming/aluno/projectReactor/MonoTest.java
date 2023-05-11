package study.reactiveProgramming.aluno.projectReactor;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@Slf4j
public class MonoTest {

  @Test
  public void test() {
    log.info("Everything working as intended");
  }

  @Test
  public void monoSubscribe() {

    String name = "Vinicius";
    Mono<String> mono = Mono.just(name).log();

    mono.subscribe();

    StepVerifier.create(mono)
        .expectNext(name)
      .verifyComplete();
  }


  @Test
  public void monoSubscriberConsumer() {
    String nome = "Vinicius Santos";
    Mono<String> mono = Mono.just(nome)
      .log();

    mono.subscribe(s -> log.info("Value {}", s));
    log.info("---------------------------------");
    StepVerifier.create(mono)
      .expectNext(nome)
      .verifyComplete();
  }


  @Test
  public void monoSubscriberConsumerError() {

    String nome = "Vinicius";
    Mono<String> mono = Mono.just(nome).log();

    mono.subscribe(s -> log.info("Value {}", s));
    log.info("----------------------------");

    StepVerifier.create(mono)
      .expectNext(nome)
      .verifyComplete();
  }
}
