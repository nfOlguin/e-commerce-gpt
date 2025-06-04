package com.parcel.ecommerce.domain;

import java.math.BigDecimal;

public class Parcel {
    private Long id;
    private String name;
    private String location;
    private BigDecimal size;
    private BigDecimal price;
    private ParcelStatus status;

    // getters and setters omitted for brevity
}
