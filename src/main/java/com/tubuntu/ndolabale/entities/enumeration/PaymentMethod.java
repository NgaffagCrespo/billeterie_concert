package com.tubuntu.ndolabale.entities.enumeration;

import lombok.Getter;

@Getter
public enum PaymentMethod {
    MOMO("MOBILE MONEY"),
    CARD("VISA/MASTERCARD");

    private final String value;

    PaymentMethod(String value) {
        this.value = value;
    }
}
