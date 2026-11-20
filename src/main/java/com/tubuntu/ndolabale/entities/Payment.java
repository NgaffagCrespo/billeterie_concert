package com.tubuntu.ndolabale.entities;

import com.tubuntu.ndolabale.entities.enumeration.PaymentCurrency;
import com.tubuntu.ndolabale.entities.enumeration.PaymentMethod;
import com.tubuntu.ndolabale.entities.enumeration.PaymentStatus;
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
public class Payment {

    @Id
    @Column(length = 36, updatable = false, nullable = false)
    private String id;

    private String paymentNumber;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @Column(length = 36, updatable = false, nullable = false, unique = true)
    private String orderTransactionId;

    @Column(length = 36, updatable = false, nullable = false, unique = true)
    private String merchantReferenceId;

    @Enumerated(EnumType.STRING)
    private PaymentCurrency currency;

    private LocalDateTime expiredDate;

    private LocalDateTime orderDate;

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
