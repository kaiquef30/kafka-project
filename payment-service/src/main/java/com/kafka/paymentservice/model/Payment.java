package com.kafka.paymentservice.model;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class Payment implements Serializable {

    private Long Id;

    private Long userId;

    private Long productId;

    private String cardNumber;

}
