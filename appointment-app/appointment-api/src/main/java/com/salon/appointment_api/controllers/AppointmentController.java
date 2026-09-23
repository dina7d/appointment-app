package com.salon.appointment_api.controllers;

import com.salon.appointment_api.models.Appointment;
import com.salon.appointment_api.services.AppointmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    private final AppointmentService service;

    public AppointmentController(AppointmentService service) {
        this.service = service;
    }

    @PostMapping
    public Appointment create(@RequestBody Appointment appointment) {
        return service.createAppointment(appointment);
    }

    @GetMapping
    public List<Appointment> getAll() {
        return service.getAllAppointments();
    }
}