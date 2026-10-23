package com.alfredlima.javaevolution;

import com.alfredlima.javaevolution.model.payment.CreditCardPayment;
import com.alfredlima.javaevolution.model.payment.MbWayPayment;
import com.alfredlima.javaevolution.model.payment.ProcessPayment;

import java.math.BigDecimal;

/**
 * Sealed + Pattern Matching
 * Java 17
 */
public class Evolution07SealedPlusPatternMatching {

    public static void main(String[] args) {

        var payment = new CreditCardPayment();
        payment.pay(BigDecimal.TEN);

        System.out.println(ProcessPayment.process(payment));

        var payment2 = new MbWayPayment();
        payment2.pay(BigDecimal.valueOf(1999.89));

        System.out.println(ProcessPayment.process(payment2));

    }
}
