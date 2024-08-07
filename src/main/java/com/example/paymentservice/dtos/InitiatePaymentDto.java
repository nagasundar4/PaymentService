package com.example.paymentservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InitiatePaymentDto {
    private String orderId;

    private String phoneNumber;

    private String name;

    private Long amount;
}