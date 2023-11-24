package com.strproducer.apachekafka.service;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class StringProducerService {

    private final KafkaTemplate<String, String> template;

    public void sendMessage(String message) {
        log.info("sending message {}", message);
        template.send("str-topic", message);
    }

}
