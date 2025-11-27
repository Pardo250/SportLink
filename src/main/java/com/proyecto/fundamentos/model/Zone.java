package com.example.sportlink.model;
import jakarta.persistence.*;

@Entity
public class Zone {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
}
