package com.example.demo.appointment;

import com.example.demo.patient.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    @Autowired
    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }
    List<Appointment> getAppointments(){
        return appointmentRepository.findAll();
    }

    public void  addNewAppointment(Appointment appointment){
        System.out.println(appointment);
    }


    public void updateAppointment(Long appointmentId, String appointmentName, String appointmentDate, String appointmentTime, String appointmentNumber) {
    }
}
