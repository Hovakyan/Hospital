package hospital.demo.services.impement;

import hospital.demo.controller.Post;
import hospital.demo.entity.Diagnosis;
import hospital.demo.entity.Patient;
import hospital.demo.repository.DiagnosisRepository;
import hospital.demo.services.DiagnosisServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

import static org.springframework.util.Assert.hasText;

@Service
public class DiagnosisServicimpl implements DiagnosisServic {


    @Autowired
    DiagnosisRepository diagnosisRepository;

    @Override
    public Diagnosis save(Diagnosis name) {
        return diagnosisRepository.save(name);
    }

    @Override
    public Optional<Diagnosis> findAllBypatientcode(String patient_code) {
        hasText(patient_code, "login can not be null.");
        return Optional.ofNullable(diagnosisRepository.findAllByPatientcode(patient_code));
    }
}
