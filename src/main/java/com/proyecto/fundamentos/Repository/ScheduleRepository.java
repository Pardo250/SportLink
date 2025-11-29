package main.java.com.proyecto.fundamentos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sportlink.model.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
