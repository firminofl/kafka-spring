package com.firmino.paymentservice.services.impl;

import com.firmino.paymentservice.model.Payment;
import com.firmino.paymentservice.services.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void sendPayment(Payment payment) {
       log.info("PAYMENT-SERVICE-IMPL ::: Pagamento {}", payment);
    }
}
