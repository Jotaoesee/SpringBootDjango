package com.compuglobalhipermeganet.paypal_service.services;

import org.springframework.stereotype.Service;

@Service
public class PayPalService {
    private final String CLIENT_ID = "A1zV2yW3zFf8gJNB4-BNra7UsEWKVqFrc6ikihp0mUl5LUGyTDjVpogsYI7cmUwjp3p2kwjvx2aDzoMlw4";
    private final String CLIENT_SECRET = "G8PjTr9u_qXhF_Y4Xs7zGvMk1RjeVr-83mLwOq2zZvk9-BFhVsTfQr5ZYk8JsDkLmY6BvX9J9j0w5xq";

    public String generarPago(double monto) {
        return "https://sandbox.paypal.com/checkout?paymentId=456";
    }
}
