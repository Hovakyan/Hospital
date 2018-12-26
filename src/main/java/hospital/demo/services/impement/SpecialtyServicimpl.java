package hospital.demo.services.impement;

import hospital.demo.entity.Specialty;
import hospital.demo.repository.SpecialtyRepository;
import hospital.demo.services.SpecialtyServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static org.springframework.util.Assert.hasText;

@Service
public class SpecialtyServicimpl implements SpecialtyServic {

    @Autowired
    SpecialtyRepository specialtyRepository;

    @Override
    public Specialty save(Specialty name) {
        return specialtyRepository.save(name);
    }


    @Override
    public Optional<Specialty> findAllByspecialtycode(String specialty_code) {
        hasText(specialty_code, "login can not be null.");
        return Optional.ofNullable(specialtyRepository.findAllByspecialtycode(specialty_code));
    }
}
