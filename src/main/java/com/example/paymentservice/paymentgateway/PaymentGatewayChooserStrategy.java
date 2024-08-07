package com.example.paymentservice.paymentgateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class PaymentGatewayChooserStrategy {

    @Autowired
    private RazorpayPaymentGateway razorpayPaymentGateway;

    @Autowired
    private StripePaymentGateway stripePaymentGateway;

    public PaymentGateway getOptimalPaymentGateway() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        if (randomNumber % 2 == 0) {
            return stripePaymentGateway;
        } else {
            return razorpayPaymentGateway;
        }
    }
}
