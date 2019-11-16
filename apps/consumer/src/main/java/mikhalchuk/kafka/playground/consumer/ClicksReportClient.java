package mikhalchuk.kafka.playground.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "clicks-report", url = "http://clicks-report")
public interface ClicksReportClient {

  @PostMapping("/clicks")
  void registerClick(@RequestBody String click);
}
