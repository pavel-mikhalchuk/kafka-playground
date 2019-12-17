package mikhalchuk.kafka.playground.consumer.avro;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class AvroConsumer {

  @KafkaListener(topics = "avro-clicks", groupId = "avro-super-group")
  void receive(ConsumerRecord<String, AvroClick> message) {
    System.out.println("Received: [" + message + "]");
  }

}
