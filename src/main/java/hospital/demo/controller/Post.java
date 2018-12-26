package hospital.demo.controller;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.util.Objects;

@Getter
@Setter
public class Post {
    private String diseasecode;
    private String diseasename;
    private String patientcode;
    private String treatment;
    private String doctorcode;
    private String fullName;
    private  String cabinet;
    private String contactNumber;
    private String specialtycode;
    private String timeofreceipt;
    private String adress;
    private  String dateofbirth;
    private String accounting;
    private String areacode;
    private String specialty;

    public Post() {
    }

    public Post(String diseasecode, String diseasename, String patientcode, String treatment, String doctorcode, String fullName, String cabinet, String contactNumber, String specialtycode, String timeofreceipt, String adress, String dateofbirth, String accounting, String areacode, String specialty) {
        this.diseasecode = diseasecode;
        this.diseasename = diseasename;
        this.patientcode = patientcode;
        this.treatment = treatment;
        this.doctorcode = doctorcode;
        this.fullName = fullName;
        this.cabinet = cabinet;
        this.contactNumber = contactNumber;
        this.specialtycode = specialtycode;
        this.timeofreceipt = timeofreceipt;
        this.adress = adress;
        this.dateofbirth = dateofbirth;
        this.accounting = accounting;
        this.areacode = areacode;
        this.specialty = specialty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(diseasecode, post.diseasecode) &&
                Objects.equals(diseasename, post.diseasename) &&
                Objects.equals(patientcode, post.patientcode) &&
                Objects.equals(treatment, post.treatment) &&
                Objects.equals(doctorcode, post.doctorcode) &&
                Objects.equals(fullName, post.fullName) &&
                Objects.equals(cabinet, post.cabinet) &&
                Objects.equals(contactNumber, post.contactNumber) &&
                Objects.equals(specialtycode, post.specialtycode) &&
                Objects.equals(timeofreceipt, post.timeofreceipt) &&
                Objects.equals(adress, post.adress) &&
                Objects.equals(dateofbirth, post.dateofbirth) &&
                Objects.equals(accounting, post.accounting) &&
                Objects.equals(areacode, post.areacode) &&
                Objects.equals(specialty, post.specialty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diseasecode, diseasename, patientcode, treatment, doctorcode, fullName, cabinet, contactNumber, specialtycode, timeofreceipt, adress, dateofbirth, accounting, areacode, specialty);
    }

    @Override
    public String toString() {
        return "Post{" +
                "diseasecode='" + diseasecode + '\'' +
                ", diseasename='" + diseasename + '\'' +
                ", patientcode='" + patientcode + '\'' +
                ", treatment='" + treatment + '\'' +
                ", doctorcode='" + doctorcode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", cabinet='" + cabinet + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", specialtycode='" + specialtycode + '\'' +
                ", timeofreceipt='" + timeofreceipt + '\'' +
                ", adress='" + adress + '\'' +
                ", dateofbirth='" + dateofbirth + '\'' +
                ", accounting='" + accounting + '\'' +
                ", areacode='" + areacode + '\'' +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
