package mikhalchuk.kafka.playground.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

  private KafkaTemplate<String, String> producer;

  public Producer(KafkaTemplate<String, String> producer) {
    this.producer = producer;
  }

  void send(String message) {
    producer.send("simple-message", message);
  }
}
