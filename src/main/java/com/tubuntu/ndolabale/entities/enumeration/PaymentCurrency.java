package com.tubuntu.ndolabale.entities.enumeration;

import lombok.Getter;

@Getter
public enum PaymentCurrency {
    XAF("XAF"),
    USD("USD"),
    EUR("EUR"),
    GBP("GBP"),
    NGN("NGN");

    private final String value;
    PaymentCurrency(String value) {
        this.value = value;
    }
}
