package hospital.demo.services;

import hospital.demo.controller.Post;

import java.util.Map;

public interface EntityServic {


    void addpacient(Post post, Map<String, Object> map);
    void addDoctor(Post post, Map<String, Object> map);
    void addDiagnosis(Post post, Map<String, Object> map);
    void addSpecialty(Post post, Map<String, Object> map);

    void getSpecialty(Post post, Map<String, Object> map);
    void getDiagnosis(Post post, Map<String, Object> map);
    void getDoctor(Post post, Map<Integer, Object> map);
    void getPacient(Post post, Map<String, Object> map);

}
