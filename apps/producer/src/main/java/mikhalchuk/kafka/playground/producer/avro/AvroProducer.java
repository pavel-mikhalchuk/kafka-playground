package mikhalchuk.kafka.playground.producer.avro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class AvroProducer {

  private KafkaTemplate<String, AvroClick> template;

  @Value("${topic.name}")
  private String TOPIC;

  public AvroProducer(KafkaTemplate<String, AvroClick> template) {
    this.template = template;
  }

  void send(AvroClick click) {
    template.send(TOPIC, click);
  }
}
