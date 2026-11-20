package com.tubuntu.ndolabale.entities.enumeration;

import lombok.Getter;

@Getter
public enum TicketStatus {
    INIT("INITIATED"),
    OFFER("OFFERED"),
    PAYED("PAYED"),
    PREPAID("PREPAID"),
    OPEN("OPEN"),
    CLOSED("CLOSED");

    private final String value;

    TicketStatus(String value)
    {this.value = value;}
}
