package hospital.demo.services;

import hospital.demo.entity.Diagnosis;
import hospital.demo.entity.Doctor;

import java.util.Optional;

public interface DoctorServic {
    Doctor save(Doctor name);
    Optional<Doctor>findAllBydoctorcode(String doctor_code);
}
