package hospital.demo.repository;

import hospital.demo.entity.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;

public interface SpecialtyRepository extends JpaRepository<Specialty,Long> {
    Specialty findAllByspecialtycode(String specialty_code);
}
