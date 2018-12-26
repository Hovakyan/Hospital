package hospital.demo.controller;

import hospital.demo.services.EntityServic;
import hospital.demo.services.SpecialtyServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {
    @Autowired
    EntityServic entityServic;


    @RequestMapping(value = "/specialty", method = RequestMethod.POST)
    public Map<String, Object> speciality(@RequestBody Post post) {
        Map<String, Object> map = new HashMap<>();
        entityServic.addSpecialty(post, map);
        return map;
    }

    @RequestMapping(value = "/doctor", method = RequestMethod.POST)
    public Map<String, Object> doctor(@RequestBody Post post) {
        Map<String, Object> map = new HashMap<>();
        entityServic.addDoctor(post, map);
        return map;

    }
    @RequestMapping(value = "/patient", method = RequestMethod.POST)
    public Map<String, Object> patient(@RequestBody Post post) {
        Map<String, Object> map = new HashMap<>();
        entityServic.addpacient(post,map);
        return map;
    }

    @RequestMapping(value = "/diagnosis", method = RequestMethod.POST)
    public Map<String, Object> diagnosis(@RequestBody Post post) {
        Map<String, Object> map = new HashMap<>();
        entityServic.addDiagnosis(post,map);
    return map;
    }

    @RequestMapping(value = "/getSpecialty", method = RequestMethod.GET)
    public Map<String, Object> getSpecialty (@RequestBody Post post) {
        Map<String, Object> map = new HashMap<>();
        entityServic.getSpecialty(post,map);
    return map;
    }

    @RequestMapping(value = "/getDiagnosis", method = RequestMethod.GET)
    public Map<String, Object> getDiagnosis (@RequestBody Post post) {
        Map<String, Object> map = new HashMap<>();
        entityServic.getDiagnosis(post,map);
        return map;
    }
    @RequestMapping(value = "/getDoctor", method = RequestMethod.GET)
    public Map<Integer, Object> getDoctor (@RequestBody Post post) {
        Map<Integer, Object> map = new HashMap<>();
        entityServic.getDoctor(post,map);
    return map;
    }

    @RequestMapping(value = "/getPacient", method = RequestMethod.GET)
    public Map<String, Object> getPacient (@RequestBody Post post) {
        Map<String, Object> map = new HashMap<>();
        entityServic.getPacient(post,map);
        return map;
    }

}