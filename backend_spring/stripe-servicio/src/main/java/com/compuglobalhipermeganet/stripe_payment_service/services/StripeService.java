package com.compuglobalhipermeganet.stripe_payment_service.services;

import com.stripe.Stripe;
import com.stripe.model.PaymentIntent;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StripeService {
    public StripeService() {
        Stripe.apiKey = "sk_test_51QqCx7DzvfiQtQhxAogrZaGS6or1LwpT6QZHj88z2Tvg4hNUEvfZH3KYaFDon86NvaZdmt3AyddGTxWt7ULeDkeu006CLLRYLA";
    }

    public PaymentIntent crearPago(double monto, String moneda) throws Exception {
        Map<String, Object> params = new HashMap<>();
        params.put("amount", (int) (monto * 100));
        params.put("currency", moneda);
        return PaymentIntent.create(params);
    }
}
