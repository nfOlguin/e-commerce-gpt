package com.parcel.ecommerce.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ParcelRepository extends JpaRepository<ParcelEntity, Long> {
}
