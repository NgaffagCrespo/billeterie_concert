package com.tubuntu.ndolabale.entities.enumeration;

import lombok.Getter;

@Getter
public enum PaymentStatus {
    CONFIRMED("CONFIRMED"),
    PROGRESS("IN_PROGRESS"),
    FAILED("FAILED"),
    CANCELED("CANCELED"),
    CREATED("CREATED"),
    INITIALIZED("INITIALISED");

    private final String value;

    PaymentStatus(String value) {
        this.value = value;
    }
}
