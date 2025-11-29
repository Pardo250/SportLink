package main.java.com.proyecto.fundamentos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sportlink.model.Sport;

public interface SportRepository extends JpaRepository<Sport, Long> {
}
