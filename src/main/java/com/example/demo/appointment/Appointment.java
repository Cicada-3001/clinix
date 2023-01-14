package main.java.com.example.demo.appointment;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name="appointments")
public class Appointment {
    @Id
    @SequenceGenerator(
            name= "appointment_sequence",
            sequenceName= "appointment_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "appointment_sequence"
    )

    @Column(name= "id")
    private long id;
    
    private String date;
    private Integer number;
    private String doctorName; 
    private String patientName; 
    private String clinicName; 
    private Integer doctorId;
    private Integer patientId;
    private Integer clinicId;
    
  
    public Appointment() {
    	
    }
    
    public Appointment(String date, Integer number, String  doctorName, String patientName, 
    	String clinicName, Integer patientId, Integer doctorId, Integer clinicId) {
        this.date = date;
        this.number = number;
        this.doctorName = doctorName; 
        this.patientName =  patientName; 
        this.clinicName = clinicName; 
        this.patientId= patientId; 
        this.doctorId= doctorId; 
        this.clinicId= clinicId;
        
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    
    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId ;
    }
    
    
    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    
    public String getPatientName() {
        return  patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName  =  patientName;
    }
    
    
    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public  Integer getClinicId() {
        return clinicId;
    }

    
    public void setClinicId(Integer clinicId) {
        this.clinicId = clinicId;
    }
    
    
    public Integer getDoctorId() {
        return  doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }
    

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}

