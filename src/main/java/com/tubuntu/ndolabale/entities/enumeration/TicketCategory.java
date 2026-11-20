package com.tubuntu.ndolabale.entities.enumeration;

import lombok.Getter;

@Getter
public enum TicketCategory {
    STANDARD("STANDARD"),
    VIP("VIP"),
    VVIP("VVIP"),
    GOLD("GOLD");

    private final String value;
    TicketCategory(String value) {
        this.value = value;
    }
}
