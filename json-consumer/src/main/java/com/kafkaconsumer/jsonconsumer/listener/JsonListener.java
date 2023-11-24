package com.kafkaconsumer.jsonconsumer.listener;


import com.kafkaconsumer.jsonconsumer.custom.JsonConsumerListener;
import com.kafkaconsumer.jsonconsumer.model.Payment;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import static java.lang.Thread.sleep;

@Component
@Log4j2
public class JsonListener {

    @SneakyThrows
    @JsonConsumerListener(topics = "payment-topic", groupId = "create-group", containerFactory = "jsonContainerFactory")
    public void antiFraud(@Payload Payment payment) {
        log.info("receive payment {}", payment.toString());
        sleep(3000);
        log.info("validating fraud...");
        sleep(2000);
        log.info("approved purchase!");
        sleep(4000);
    }

    @SneakyThrows
    @JsonConsumerListener(topics = "payment-topic", groupId = "invoice-group", containerFactory = "jsonContainerFactory")
    public void invoiceGenerator(@Payload Payment payment) {
        log.info("issuing note of the product with the id " + payment.getId());
        sleep(3000);
    }

    @SneakyThrows
    @JsonConsumerListener(topics = "payment-topic", groupId = "email-group", containerFactory = "jsonContainerFactory")
    public void sendEmail() {
        log.info("sending confirmation email...");
    }
}
