package mikhalchuk.kafka.playground.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

  private ClicksReportClient clicksReportClient;

  public Consumer(ClicksReportClient clicksReportClient) {
    this.clicksReportClient = clicksReportClient;
  }

  @KafkaListener(topics = "clicks", groupId = "super-group")
  void receive(String message) {
    System.out.println("Received: [" + message + "]");

    clicksReportClient.registerClick(message);

    System.out.println("Click is registered in clicks report service.");
  }
}
