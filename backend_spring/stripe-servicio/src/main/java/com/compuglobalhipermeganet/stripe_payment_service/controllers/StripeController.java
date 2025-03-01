package com.compuglobalhipermeganet.stripe_payment_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.compuglobalhipermeganet.stripe_payment_service.services.StripeService;
import com.stripe.model.PaymentIntent;


@RestController
@RequestMapping("/stripe")
public class StripeController {
    @Autowired
    private StripeService stripeService;

    @PostMapping("/pago")
    public ResponseEntity<String> pagar(@RequestParam double monto) throws Exception {
        PaymentIntent intent = stripeService.crearPago(monto, "usd");
        return ResponseEntity.ok(intent.getClientSecret());
    }
}
