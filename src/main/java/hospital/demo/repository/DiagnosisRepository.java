package hospital.demo.repository;

import hospital.demo.entity.Diagnosis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiagnosisRepository extends JpaRepository<Diagnosis,Long> {

    Diagnosis findAllByPatientcode(String patient_code);
}
