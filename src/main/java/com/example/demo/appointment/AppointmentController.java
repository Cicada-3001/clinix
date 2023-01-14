package main.java.com.example.demo.appointment;

import static main.java.com.example.demo.Shared.BASEURL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@CrossOrigin(origins = BASEURL)
@RestController
@RequestMapping(path ="appointments")
public class AppointmentController {
    private final AppointmentService appointmentService;

    @Autowired
    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @RequestMapping("/")
    @GetMapping()
    List<Appointment> getAppointments(){
        return appointmentService.getAppointments();
    }
    
    
    @RequestMapping("/patient")
    @GetMapping()
    List<Appointment> getAppointmentByPatient(@RequestParam Integer patientId){
        return appointmentService.getAppointmentsByPatient(patientId);
    }
    
    
    @RequestMapping("/clinic")
    @GetMapping()
    List<Appointment> getAppointmentByClinic(@RequestParam Integer clinicId){
        return appointmentService.getAppointmentsByClinic(clinicId);
    }
    
    
    @RequestMapping("/doctor")
    @GetMapping()
    List<Appointment> getAppointmentByDoctor(@RequestParam Integer doctorId){
        return appointmentService.getAppointmentsByDoctor(doctorId);
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


    @DeleteMapping(path = "{appointmentId}")
    public void deleteUser(@PathVariable("appointmentId") Long appointmentId){
        appointmentService.deleteAppointment(appointmentId);
        
    }






}
