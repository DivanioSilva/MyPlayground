package com.ds.springbootkafka.components;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageConsumer {

    @Value("${spring.kafka.consumer.group-id}")
    private String consumerGroupId;

    @KafkaListener(topics = "my-topic", groupId = "my-group-id")
    public void listen(String message){
      log.info("Received message: {}", message);
    }
}
