package mikhalchuk.kafka.playground.producer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Api {

  private final Producer simpleProducer;

  public Api(Producer simpleProducer) {
    this.simpleProducer = simpleProducer;
  }

  @PostMapping("/message")
  public ResponseEntity<String> message(@RequestBody String message) {
    simpleProducer.send(message);
    return ResponseEntity.ok("Message received: " + message);
  }
}