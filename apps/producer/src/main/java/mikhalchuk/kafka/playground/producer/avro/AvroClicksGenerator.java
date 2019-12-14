package mikhalchuk.kafka.playground.producer.avro;

import static java.lang.String.valueOf;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class AvroClicksGenerator {

  private AvroProducer producer;

  public AvroClicksGenerator(AvroProducer producer) {
    this.producer = producer;
  }

  @Scheduled(fixedRate = 100)
  void click() {
    producer.send(new AvroClick(valueOf(new Random().nextInt(10))));
  }
}