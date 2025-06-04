package com.parcel.ecommerce.domain;

import java.math.BigDecimal;

public class Parcel {
    private Long id;
    private String name;
    private String location;
    private BigDecimal size;
    private BigDecimal price;
    private ParcelStatus status;
    /**
     * Polygon shape in WKT format defining the lot on the map.
     */
    private String shape;
    /**
     * Owner information for this parcel.
     */
    private String ownerInfo;
    /**
     * Additional features or infrastructure details.
     */
    private String extras;

    // getters and setters omitted for brevity
}
