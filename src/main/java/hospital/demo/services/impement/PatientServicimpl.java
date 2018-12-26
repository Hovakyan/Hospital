package hospital.demo.services.impement;

import hospital.demo.entity.Patient;
import hospital.demo.repository.PatientRepository;
import hospital.demo.services.PatientServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.util.Assert.hasText;

@Service
public class PatientServicimpl implements PatientServic {

    @Autowired
    PatientRepository patientRepository;

    @Override
    public Patient save(Patient name) {
        return patientRepository.save(name);
    }

    @Override
    public Optional<Patient> findAllByDoctorcode(String doctor_code) {
        hasText(doctor_code, "login can not be null.");
        return Optional.ofNullable(patientRepository.findAllByDoctorcode(doctor_code));
    }

    @Override
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }
}
