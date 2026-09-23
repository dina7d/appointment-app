package com.salon.appointment_api.controllers;

import com.salon.appointment_api.models.Client;
import com.salon.appointment_api.services.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }

    @PostMapping
    public Client create(@RequestBody Client client) {
        return service.createClient(client);
    }

    @GetMapping
    public List<Client> getAll() {
        return service.getAllClients();
    }
}