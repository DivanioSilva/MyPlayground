package com.ds.springbootkafka;

import com.ds.springbootkafka.components.MessageProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class KafkaController {

    private final MessageProducer messageProducer;

    public KafkaController(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    @PostMapping("/send")
    public void sendMessage(@RequestParam("message") String message){
        messageProducer.sendMessage("my-topic", message);
        log.info("Sending message {} to topic {}", message, "my-topic");
    }
}
