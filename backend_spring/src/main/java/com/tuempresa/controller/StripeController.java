package com.tuempresa.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/stripe")
public class StripeController {

    @Value("${stripe.secret.key}")
    private String stripeSecretKey;

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/servicio1")
    public ResponseEntity<String> obtenerCargosStripe() {
        String url = "https://api.stripe.com/v1/charges";

        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Bearer " + stripeSecretKey);

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class, headers);
        return ResponseEntity.ok(response.getBody());
    }

    @GetMapping("/servicio2")
    public ResponseEntity<String> obtenerClientesStripe() {
        String url = "https://api.stripe.com/v1/customers";

        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Bearer " + stripeSecretKey);

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class, headers);
        return ResponseEntity.ok(response.getBody());
    }
}
