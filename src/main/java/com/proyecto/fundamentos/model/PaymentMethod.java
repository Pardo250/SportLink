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
@Table(name = "payment_methods")
>>>>>>> d6e6ff7 (pardo gay)
public class PaymentMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String methodName;
<<<<<<< HEAD
=======

    public PaymentMethod() {}

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMethodName() { return methodName; }
    public void setMethodName(String methodName) { this.methodName = methodName; }
>>>>>>> d6e6ff7 (pardo gay)
}
