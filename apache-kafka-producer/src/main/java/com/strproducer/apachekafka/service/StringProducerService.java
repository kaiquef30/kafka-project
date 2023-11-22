package com.strproducer.apachekafka.service;


import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StringProducerService {

    private final KafkaTemplate<String, String> template;

    public void sendMessage(String message) {
        template.send("str-topic", message);
    }

}
