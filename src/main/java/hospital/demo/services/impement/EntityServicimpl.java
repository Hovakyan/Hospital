package hospital.demo.services.impement;

import hospital.demo.controller.Post;
import hospital.demo.entity.Diagnosis;
import hospital.demo.entity.Doctor;
import hospital.demo.entity.Patient;
import hospital.demo.entity.Specialty;
import hospital.demo.repository.DiagnosisRepository;
import hospital.demo.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.tools.DiagnosticListener;
import java.util.Map;

@Service
public class EntityServicimpl implements EntityServic {

    @Autowired
    DiagnosisServic diagnosisServic;


    @Autowired
    DiagnosisServicimpl diagnosisServicimpl;
    @Autowired
    PatientServic patientServic;
    @Autowired
    PatientServicimpl patientServicimpl;

    @Autowired
    DoctorServic doctorServic;
    @Autowired
    DoctorServicimpl doctorServicimpl;

    @Autowired
    SpecialtyServic specialtyServic;
    @Autowired
    SpecialtyServicimpl specialtyServicimpl;






    @Override
    public void addpacient(Post post, Map<String, Object> map) {
        Patient patient = new Patient();
       patient.setPatientcode(post.getPatientcode());
       patient.setFullName(post.getFullName());
       patient.setAdress(post.getAdress());
       patient.setDateofbirth(post.getDateofbirth());
       patient.setContactNumber(post.getContactNumber());
       patient.setAccounting(post.getAccounting());
       patient.setDoctorcode(post.getDoctorcode());
       patient.setAreacode(post.getAreacode());
       patientServic.save(patient);
        map.put("pacient info ",patient);

    }

    @Override
    public void addDoctor(Post post, Map<String, Object> map) {
        Doctor doctor = new Doctor();
        doctor.setDoctorcode(post.getDoctorcode());
        doctor.setFullName(post.getFullName());
        doctor.setCabinet(post.getCabinet());
        doctor.setContactNumber(post.getContactNumber());
        doctor.setSpecialty_code(post.getSpecialtycode());
        doctor.setTimeofreceipt(post.getTimeofreceipt());
        doctorServic.save(doctor);
    map.put("doctor info ",doctor);

    }

    @Override
    public void addDiagnosis(Post post, Map<String, Object> map) {
        Diagnosis diagnosis = new Diagnosis();
       diagnosis.setDiseasecode(post.getDiseasecode());
       diagnosis.setDiseasename(post.getDiseasename());
       diagnosis.setPatientcode(post.getPatientcode());
       diagnosis.setTreatment(post.getTreatment());
       diagnosisServic.save(diagnosis);
        map.put("diagnosis info ",diagnosis);


    }

    @Override
    public void addSpecialty(Post post, Map<String, Object> map) {
        Specialty specialty = new Specialty();
        specialty.setSpecialtycode(post.getSpecialtycode());
        specialty.setSpecialty(post.getSpecialty());
        specialtyServic.save(specialty);
        map.put("specialty info ",specialty);
    }

    @Override
    public void getSpecialty(Post post, Map<String, Object> map) {
    map.put("get all doctors by specialty",specialtyServic.findAllByspecialtycode(post.getSpecialtycode()).get());
    }

    @Override
    public void getDiagnosis(Post post, Map<String, Object> map) {
        map.put("get diagnosis by cod pacient",diagnosisServic.findAllBypatientcode(post.getPatientcode()).get());
    }

    @Override
    public void getDoctor(Post post, Map<Integer, Object> map) {
        int index = 0;
        for (Patient pat:patientServic.findAll()) {
        if (pat.getDoctorcode().equals(post.getDoctorcode())){
            index++;
            map.put(index,pat);
        }
        }

    }

    @Override
    public void getPacient(Post post, Map<String, Object> map) {
    map.put("get pacient by diagnosis cod",patientServic.findAllByDoctorcode(post.getDiseasecode()).get());
    }
}

