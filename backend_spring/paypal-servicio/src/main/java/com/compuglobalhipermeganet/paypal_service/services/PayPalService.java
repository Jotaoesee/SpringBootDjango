package com.compuglobalhipermeganet.paypal_service.services;

import org.springframework.stereotype.Service;

@Service
public class PayPalService {
    private final String CLIENT_ID = "A1zV2yW3zFf8gJNB4-BNra7UsEWKVqFrc6ikihp0mUl5LUGyTDjVpogsYI7cmUwjp3p2kwjvx2aDzoMlw4";
    private final String CLIENT_SECRET = "EHasvDq_465HxbF_yRf7qBpjvrjF1N_BMv_83djPw2nj4-bCMRDHRt2f9TBb-DxM5r1SxZG7K6dvVxqR";

    public String generarPago(double monto) {
        return "https://sandbox.paypal.com/checkout?paymentId=456";
    }
}
