package com.compuglobalhipermeganet.paypal_service.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.compuglobalhipermeganet.paypal_service.services.PayPalService;



@RestController
@RequestMapping("/paypal")
public class PayPalController {
    @Autowired
    private PayPalService payPalService;

    @PostMapping("/pago")
    public ResponseEntity<String> pagar(@RequestParam double monto) {
        return ResponseEntity.ok(payPalService.generarPago(monto));
    }
}
