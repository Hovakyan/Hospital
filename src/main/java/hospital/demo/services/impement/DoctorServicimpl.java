package hospital.demo.services.impement;

import hospital.demo.entity.Doctor;
import hospital.demo.repository.DoctorRepository;
import hospital.demo.services.DoctorServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static org.springframework.util.Assert.hasText;

@Service
public class DoctorServicimpl implements DoctorServic {

    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public Doctor save(Doctor name) {
        return doctorRepository.save(name);
    }

    @Override
    public Optional<Doctor> findAllBydoctorcode(String doctor_code) {
        hasText(doctor_code, "login can not be null.");
        return Optional.ofNullable(doctorRepository.findAllBydoctorcode(doctor_code));
    }
}
