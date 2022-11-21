package com.firmino.paymentservice.resource;


import com.firmino.paymentservice.model.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface PaymentResource {
    @PostMapping
    ResponseEntity<Payment> doPayment(@RequestBody Payment payment);
}
