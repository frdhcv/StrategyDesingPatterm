package org.example.strategydesingpatterm.dao;

import org.example.strategydesingpatterm.enums.PaymentMethodEnum;
import org.springframework.stereotype.Repository;

@Repository
public class Cash implements Dao {
    @Override
    public void pay() {
        System.out.println("I pay with cash ");
    }

    @Override
    public PaymentMethodEnum getPaymentMethod() {
        return PaymentMethodEnum.CASH;
    }
}
