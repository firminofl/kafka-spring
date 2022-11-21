package com.firmino.paymentservice.services;

import com.firmino.paymentservice.model.Payment;
import org.springframework.stereotype.Service;

public interface PaymentService {
    void sendPayment(Payment payment);
}
