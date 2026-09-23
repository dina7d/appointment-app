package com.salon.appointment_api.services;

import com.salon.appointment_api.models.Client;
import com.salon.appointment_api.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository repository;

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public Client createClient(Client client) {
        return repository.save(client);
    }

    public List<Client> getAllClients() {
        return repository.findAll();
    }
}