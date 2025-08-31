package by.dobrynin.dobrovet.Entity;

import by.dobrynin.dobrovet.Entity.persons.Client;
import by.dobrynin.dobrovet.Entity.persons.Doctor;
import by.dobrynin.dobrovet.enums.AppointmentStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name="appointments")
@Data
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "doctor_id",nullable = false)
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "pet_id",nullable = false)
    private Pet pet;

    @ManyToOne
    @JoinColumn(name = "client_id",nullable = false)
    private Client client;

    @Column(nullable = false)
    private LocalDateTime dateOfAppointment;

    @Column(name = "created_at")
    private  LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Enumerated(EnumType.STRING)
    private AppointmentStatus status;

    @PrePersist
    public void prePersist(){
        createdAt = LocalDateTime.now();
        updatedAt = createdAt;
    }

    @PreUpdate
    public void preUpdate(){
        updatedAt = LocalDateTime.now();
    }

}
