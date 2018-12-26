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
public class Specialty {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private Long id;


    @Column(nullable = false,length = 500)
    private String specialtycode;

    @Column(nullable = false,length = 500)
    private String specialty;




}
