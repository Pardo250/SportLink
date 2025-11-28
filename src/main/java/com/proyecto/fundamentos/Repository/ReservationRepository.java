import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto.fundamentos.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}

