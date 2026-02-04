package mx.edu.itsoeh.vitalsigns.repository;

import mx.edu.itsoeh.vitalsigns.model.VitalSign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VitalSignsRepository extends JpaRepository<VitalSign, Long> {
}
