package hospital.demo.services;

import hospital.demo.entity.Diagnosis;
import hospital.demo.entity.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientServic {

    Patient save(Patient name);

    Optional<Patient> findAllByDoctorcode(String doctor_code);
    List<Patient> findAll();
}
