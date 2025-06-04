package com.parcel.ecommerce.application;

import com.parcel.ecommerce.infrastructure.persistence.ParcelEntity;
import com.parcel.ecommerce.infrastructure.persistence.ParcelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParcelService {
    private final ParcelRepository repository;

    public ParcelService(ParcelRepository repository) {
        this.repository = repository;
    }

    public List<ParcelEntity> findAll() {
        return repository.findAll();
    }

    public ParcelEntity save(ParcelEntity parcel) {
        return repository.save(parcel);
    }
}
