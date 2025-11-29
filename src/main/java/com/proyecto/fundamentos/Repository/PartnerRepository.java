package main.java.com.proyecto.fundamentos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sportlink.model.Partner;

public interface PartnerRepository extends JpaRepository<Partner, Long> {
}
