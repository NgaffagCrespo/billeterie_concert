package com.tubuntu.ndolabale.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.*;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@EntityScan
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Receipt {

    @Id
    @Column(length = 36, updatable = false, nullable = false)
    private String id;

    private LocalDateTime createdAt;

    private List<String> ticketIds;

    private String paymentId;

    @Column(length = 5, updatable = false, nullable = false, unique = true)
    private String ticketCode;

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
