package com.parcel.ecommerce.infrastructure.persistence;

import com.parcel.ecommerce.domain.ParcelStatus;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "parcels")
public class ParcelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    private BigDecimal size;
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private ParcelStatus status;
    // getters and setters omitted for brevity
}
