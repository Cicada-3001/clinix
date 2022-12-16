package com.example.demo.patient;

import com.example.demo.user.User;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;


@Entity
@Table(name="patients")
public class Patient{
    @Id
    @SequenceGenerator(
            name= "patient_sequence",
            sequenceName= "patient_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "patient_sequence"
    )
    private long id;
    private String firstname;
    private String lastname;
    private String address;
    private String  dob;
    private String blood;

    @Transient
    private Integer age;
    private String sex;

    public Patient(){
    }

    public Patient(String firstname, String lastname, String address, String dob, String blood, String sex) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.dob = dob;
        this.blood = blood;
        this.sex = sex;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    /*public Integer getAge(){
        return Period.between(this.dob, LocalDate.now()).getYears();
        
    }*/
}
