package com.alfredlima.javaevolution.model.payment;

import java.math.BigDecimal;

public class ProcessPayment {

    public static String process(Payment payment) {

        if (payment instanceof CreditCardPayment creditCardPayment) {
            return "Processing card " + creditCardPayment.getValue();
        }

        if (payment instanceof MbWayPayment mbWayPayment) {            
            return "Processing MbWay " + mbWayPayment.getValue();
        }

        throw new IllegalStateException();
    }
}
