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
public class Doctor {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private Long id;


    @Column(nullable = false,length = 500)
    private String doctorcode;

    @Column(nullable = false,length = 500)
    private String fullName;

    @Column(nullable = false,length = 500)
    private  String cabinet;

    @Column(nullable = false,length = 500)
    private String contactNumber;

    @Column(nullable = false,length = 500)
    private String specialty_code;

    @Column(nullable = false,length = 500)
    private String timeofreceipt;




}
