package org.example.strategydesingpatterm.service;

import org.example.strategydesingpatterm.dao.Dao;
import org.example.strategydesingpatterm.enums.PaymentMethodEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Service
public class PaymentService {
    Map<PaymentMethodEnum, Dao> map;

    @Autowired
    public PaymentService(Set<Dao> paymentTypeSet) {
        createStrategy(paymentTypeSet);
    }

    private void createStrategy(Set<Dao> paymentTypeSet) {
        map = new HashMap<PaymentMethodEnum, Dao>();
        paymentTypeSet.
                stream().
                forEach(paymentType -> map.put(paymentType.getPaymentMethod(), paymentType));
    }

    public Dao findPaymentType(PaymentMethodEnum paymentType) {
        return map.get(paymentType);
    }
}
