package com.alfredlima.javaevolution.model.payment;

import com.alfredlima.javaevolution.model.payment.Payment;

import java.math.BigDecimal;

public final class CreditCardPayment implements Payment {

    private BigDecimal value;
    @Override
    public void pay(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }
}
