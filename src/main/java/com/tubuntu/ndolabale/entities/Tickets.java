package com.tubuntu.ndolabale.entities;

import com.tubuntu.ndolabale.entities.enumeration.TicketCategory;
import com.tubuntu.ndolabale.entities.enumeration.TicketStatus;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@EntityScan
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Tickets {

    @Id
    @Column(length = 36, updatable = false, nullable = false)
    private String id;

    private String description;

    @Enumerated(EnumType.STRING)
    private TicketCategory category;

    private double unitPrice;

    private int stock;

    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;

    private LocalDateTime createdAt;

    @PrePersist
    private void ensureId() {
        if (this.id == null || this.id.isBlank()) {
            this.id = UUID.randomUUID().toString();
        }

        if (this.createdAt == null) {
            this.createdAt = LocalDateTime.now();
        }
    }
}
