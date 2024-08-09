package org.example.strategydesingpatterm.dao;

import org.example.strategydesingpatterm.enums.PaymentMethodEnum;
import org.springframework.stereotype.Repository;

@Repository
public interface Dao {

    void pay();

    public PaymentMethodEnum getPaymentMethod();
}
