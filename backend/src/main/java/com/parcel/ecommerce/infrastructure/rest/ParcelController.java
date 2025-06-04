package com.parcel.ecommerce.infrastructure.rest;

import com.parcel.ecommerce.application.ParcelService;
import com.parcel.ecommerce.infrastructure.persistence.ParcelEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parcels")
@CrossOrigin
public class ParcelController {
    private final ParcelService service;

    public ParcelController(ParcelService service) {
        this.service = service;
    }

    @GetMapping
    public List<ParcelEntity> all() {
        return service.findAll();
    }

    @PostMapping
    public ParcelEntity create(@RequestBody ParcelEntity parcel) {
        return service.save(parcel);
    }
}
