package mikhalchuk.kafka.playground.producer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ClicksGenerator {

  private Producer producer;

  public ClicksGenerator(Producer producer) {
    this.producer = producer;
  }

  @Scheduled(fixedRate = 100)
  void click() {
    producer.send("Button " + new Random().nextInt(10) + " click!");
  }
}