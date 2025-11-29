package main.java.com.proyecto.fundamentos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sportlink.model.PaymentMethod;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {
}
