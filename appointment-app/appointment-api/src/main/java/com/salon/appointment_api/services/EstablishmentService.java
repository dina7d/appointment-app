package com.salon.appointment_api.services;

import com.salon.appointment_api.models.Establishment;
import com.salon.appointment_api.repositories.EstablishmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstablishmentService {

    private final EstablishmentRepository repository;

    public EstablishmentService(EstablishmentRepository repository) {
        this.repository = repository;
    }

    public Establishment createEstablishment(Establishment establishment) {
        return repository.save(establishment);
    }

    public List<Establishment> getAllEstablishments() {
        return repository.findAll();
    }
}