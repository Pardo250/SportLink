package main.java.com.proyecto.fundamentos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto.fundamentos.model.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
