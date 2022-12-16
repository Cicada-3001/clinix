package com.example.demo.appointment;

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

    private long id;
    private String appointmentName;
    private Date appointmentDate;
    private Time appointmentTime;
    private Integer appointmentNumber;
    private Integer doctorId;
    private Integer patientId;

    private Integer clinicId;
    public Appointment(){

    }
    public Appointment(long id, String appointmentName, Date appointmentDate, Time appointmentTime, Integer appointmentNumber) {
        this.id = id;
        this.appointmentName = appointmentName;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.appointmentNumber = appointmentNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAppointmentName() {
        return appointmentName;
    }

    public void setAppointmentName(String appointmentName) {
        this.appointmentName = appointmentName;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Time getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Time appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public Integer getAppointmentNumber() {
        return appointmentNumber;
    }

    public void setAppointmentNumber(Integer appointmentNumber) {
        this.appointmentNumber = appointmentNumber;
    }
}

