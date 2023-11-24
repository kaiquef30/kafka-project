package com.kafkaconsumer.jsonconsumer.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Payment implements Serializable {

    private Long Id;

    private Long userId;

    private Long productId;

    private String cardNumber;

}
