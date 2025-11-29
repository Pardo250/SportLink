package main.java.com.proyecto.fundamentos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sportlink.model.Zone;

public interface ZoneRepository extends JpaRepository<Zone, Long> {
}
