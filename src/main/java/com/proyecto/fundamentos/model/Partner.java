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
@Table(name = "partners")
>>>>>>> d6e6ff7 (pardo gay)
public class Partner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
<<<<<<< HEAD
    private String document;
=======
    private String address;
    private String phone;

    public Partner() {}

    // Getters & Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
>>>>>>> d6e6ff7 (pardo gay)
}
