package com.tuempresa.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/deepseek")
public class DeepseekController {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/servicio1")
    public ResponseEntity<String> deepseekServicio1() {
        String url = "https://api.deepseek.com/example-endpoint1";

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return ResponseEntity.ok(response.getBody());
    }

    @GetMapping("/servicio2")
    public ResponseEntity<String> deepseekServicio2() {
        String url = "https://api.deepseek.com/example-endpoint2";

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return ResponseEntity.ok(response.getBody());
    }
}
