package hospital.demo.repository;

import hospital.demo.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {

    Doctor findAllBydoctorcode(String specialty_code);
}
