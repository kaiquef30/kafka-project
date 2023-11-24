package com.kafka.paymentservice.service.impl;

import com.kafka.paymentservice.model.Payment;
import com.kafka.paymentservice.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;


@Service
@Log4j2
public class PaymentServiceImpl implements PaymentService {


    @Override
    public void sendPayment(Payment payment) {
        log.info("PAYMENT_SERVICE_IMPL::: Payment Receive {}", payment);
    }
}
