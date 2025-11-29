<<<<<<< HEAD
package main.java.com.proyecto.fundamentos.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
=======
package com.example.sportlink.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sports")
>>>>>>> d6e6ff7 (pardo gay)
public class Sport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
<<<<<<< HEAD
=======
    private String description;

    public Sport() {}

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
>>>>>>> d6e6ff7 (pardo gay)
}
