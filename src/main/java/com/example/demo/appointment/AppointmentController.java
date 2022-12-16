package com.example.demo.appointment;

import com.example.demo.clinic.Clinic;
import com.example.demo.clinic.ClinicService;
import com.example.demo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="appointments")
public class AppointmentController {
    private final AppointmentService appointmentService;

    @Autowired
    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping()
    List<Appointment> getAppointments(){
        return appointmentService.getAppointments();
    }

    @PostMapping()
    public void createAppoinment(@RequestBody Appointment appointment){
        this.appointmentService.addNewAppointment(appointment);
    }

    @PutMapping(path = "{appointmentId}")
    public void updateAppointment(
            @PathVariable("appointmentId") Long appointmentId,
            @RequestParam(required = false) String appointmentName,
            @RequestParam(required = false) String appointmentDate,
            @RequestParam(required = false) String appointmentTime,
            @RequestParam(required = false) String appointmentNumber
    ){
        appointmentService.updateAppointment(appointmentId, appointmentName, appointmentDate, appointmentTime, appointmentNumber);
    }








}
