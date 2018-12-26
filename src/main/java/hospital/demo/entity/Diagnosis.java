package hospital.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor

public class Diagnosis {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;



    @Column(nullable = false,length = 500)
    private String diseasecode;

    @Column(nullable = false,length = 500)
    private String diseasename;

    @Column(nullable = false,length = 500)
    private String patientcode;

    @Column(nullable = false,length = 500)
    private String treatment;


}
