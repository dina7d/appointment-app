package com.salon.appointment_api.controllers;

import com.salon.appointment_api.models.Establishment;
import com.salon.appointment_api.services.EstablishmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/establishments")
public class EstablishmentController {

    private final EstablishmentService service;

    public EstablishmentController(EstablishmentService service) {
        this.service = service;
    }

    @PostMapping
    public Establishment create(@RequestBody Establishment establishment) {
        return service.createEstablishment(establishment);
    }

    @GetMapping
    public List<Establishment> getAll() {
        return service.getAllEstablishments();
    }
}