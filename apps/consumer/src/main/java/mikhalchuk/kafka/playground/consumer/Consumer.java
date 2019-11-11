package mikhalchuk.kafka.playground.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

  @KafkaListener(topics = "clicks", groupId = "super-group")
  void receive(String message) {
    System.out.println("Received: [" + message + "]");
  }
}
