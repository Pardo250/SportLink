package com.example.sportlink.model;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Reservation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne private User user;
    @ManyToOne private Zone zone;
    @ManyToOne private Sport sport;
    @ManyToOne private Schedule schedule;
    @ManyToOne private PaymentMethod paymentMethod;
    private LocalDate date;
    private String notes;
    private String status;
}
