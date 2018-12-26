package hospital.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor

public class Patient {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(nullable = false,length = 500)
    private String patientcode;

    @Column(nullable = false,length = 500)
    private String fullName;

    @Column(nullable = false,length = 500)
    private String adress;

    @Column(nullable = false,length = 500)
    private  String dateofbirth;

    @Column(nullable = false,length = 500)
    private String contactNumber;

    @Column(nullable = false,length = 500)
    private String accounting;

    @Column(nullable = false,length = 500)
    private String doctorcode;

    @Column(nullable = false,length = 500)
    private String areacode;



}
