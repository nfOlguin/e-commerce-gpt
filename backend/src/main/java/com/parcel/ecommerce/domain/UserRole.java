package com.parcel.ecommerce.domain;

/**
 * Roles available in the system. Currently only HOLDING_USER is used for
 * authentication. Guests access the API without login. EXECUTIVE will be
 * incorporated in the future.
 */
public enum UserRole {
    HOLDING_USER,
    EXECUTIVE
}
