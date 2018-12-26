package hospital.demo.repository;

import hospital.demo.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {

    Patient findAllByDoctorcode(String doctor_code);
    List<Patient> findAll();

}
