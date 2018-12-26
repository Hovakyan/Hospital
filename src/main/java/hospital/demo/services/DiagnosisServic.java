package hospital.demo.services;

import hospital.demo.controller.Post;
import hospital.demo.entity.Diagnosis;
import hospital.demo.repository.DiagnosisRepository;

import javax.swing.text.html.Option;
import java.util.Map;
import java.util.Optional;

public interface DiagnosisServic  {


    Diagnosis save(Diagnosis name);

  Optional<Diagnosis> findAllBypatientcode(String patient_code);

}
