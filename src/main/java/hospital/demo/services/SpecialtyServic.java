package hospital.demo.services;

import hospital.demo.controller.Post;
import hospital.demo.entity.Diagnosis;
import hospital.demo.entity.Specialty;

import java.util.Map;
import java.util.Optional;

public interface SpecialtyServic {

    Specialty save(Specialty name);
    Optional<Specialty> findAllByspecialtycode(String specialty_code);
}
