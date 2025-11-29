package main.java.com.proyecto.fundamentos.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sportlink.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByUserId(Long userId);
}
