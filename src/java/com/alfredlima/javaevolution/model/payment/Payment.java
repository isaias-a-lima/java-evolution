package com.alfredlima.javaevolution.model.payment;

import java.math.BigDecimal;

public sealed interface Payment permits CreditCardPayment, MbWayPayment {

    void pay(BigDecimal value);
}
