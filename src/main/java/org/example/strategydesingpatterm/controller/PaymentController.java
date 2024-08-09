package org.example.strategydesingpatterm.controller;

import org.example.strategydesingpatterm.enums.PaymentMethodEnum;
import org.example.strategydesingpatterm.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class PaymentController {

    @Autowired
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/pay")
    public void pay(@RequestParam PaymentMethodEnum paymentMethod) {
        paymentService.findPaymentType(paymentMethod).pay();
    }

}

