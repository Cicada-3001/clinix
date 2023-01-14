package main.java.com.example.demo.doctor;

import jakarta.persistence.*;
import jdk.jfr.Enabled;

@Entity
@Table(name="doctors")
public class Doctor{
    @Id
    @SequenceGenerator(
            name="doctor_generator",
            sequenceName= "doctor_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_generator"
    )

    private long id;
    private long userId;
    private String firstname;
    private String lastname;
    private String speciality;
    private long clinicId;
    private Integer experience; 
    private String contact; 
    private String imgUrl; 
    


    public Doctor(){
        super();
    }

    public Doctor(String firstname, String lastname, String speciality, long clinicId, 
    	 Integer experience,String imgUrl) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.speciality = speciality;
        this.clinicId = clinicId;
        this.experience = experience; 
        this.imgUrl= imgUrl; 
    }

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    

    public Integer getExperince() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    } 
    
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    } 
    
    

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public long getClinicId() {
        return clinicId;
    }

    public void setClinicId(long clinicId) {
        this.clinicId = clinicId;
    }
}


