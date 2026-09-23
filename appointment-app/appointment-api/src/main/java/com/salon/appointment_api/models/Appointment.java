package com.salon.appointment_api.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    // This creates the foreign key to the clients table
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    // This creates the foreign key to the employees table
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    // This creates the foreign key to the establishments table
    @ManyToOne
    @JoinColumn(name = "establishment_id")
    private Establishment establishment;

    @Column(name = "appointment_date")
    private LocalDateTime appointmentDate;

    @Column(name = "sync_status")
    private String syncStatus = "PENDING";

    public Appointment() {}

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }

    public Employee getEmployee() { return employee; }
    public void setEmployee(Employee employee) { this.employee = employee; }

    public Establishment getEstablishment() { return establishment; }
    public void setEstablishment(Establishment establishment) { this.establishment = establishment; }

    public LocalDateTime getAppointmentDate() { return appointmentDate; }
    public void setAppointmentDate(LocalDateTime appointmentDate) { this.appointmentDate = appointmentDate; }

    public String getSyncStatus() { return syncStatus; }
    public void setSyncStatus(String syncStatus) { this.syncStatus = syncStatus; }
}