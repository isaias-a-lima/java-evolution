package com.alfredlima.javaevolution;

import com.alfredlima.javaevolution.model.payment.MbWayPayment;

import java.math.BigDecimal;

/**
 * Sealed Classes
 * Java 17
 */
public class Evolution06SealedClasses {

    public static void main(String[] args) {
        var payment = new MbWayPayment();

        payment.pay(BigDecimal.TEN);

        System.out.println("Value: " + payment.getValue());
    }

}
