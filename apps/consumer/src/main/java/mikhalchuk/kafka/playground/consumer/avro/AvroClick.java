package mikhalchuk.kafka.playground.consumer.avro;

class AvroClick {

  private String buttonId;

  String buttonId() {
    return buttonId;
  }

  @Override
  public String toString() {
    return "AvroClick: {buttonId='" + buttonId + '\'' + '}';
  }
}
