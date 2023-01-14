package main.java.com.example.demo.appointment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import main.java.com.example.demo.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


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
    
 
    List <Appointment> getAppointmentsByPatient(Integer patientId){
    	List<Appointment> appointments=appointmentRepository.findAllByPatientId(patientId); 
        return appointments;  
    }
    
    
    List<Appointment> getAppointmentsByClinic(Integer clinicId){
    	List<Appointment> appointments= appointmentRepository.findAllByClinicId(clinicId);
        return appointments;
    }
    

    List<Appointment> getAppointmentsByDoctor(Integer doctorId){
    	List<Appointment> appointments=   appointmentRepository.findAllByDoctorId(doctorId);
        return appointments;
    }
    
   

    public void  addNewAppointment(Appointment appointment){
    	Optional<Appointment> appointmentOptional= appointmentRepository.findByNumber(appointment.getNumber());

        if(appointmentOptional.isPresent()){
            throw new IllegalStateException("appointment already exists"); 
         }else
          appointmentRepository.save(appointment);
    }

    public void updateAppointment(Long appointmentId, String appointmentName, String appointmentDate, 
    		String appointmentTime, String appointmentNumber) {
    	System.out.println("We are printing it soon");
    }
    
    
    public void deleteAppointment(long appointmentId){
        boolean exists = appointmentRepository.existsById(appointmentId);
        if(!exists)
            throw new IllegalStateException("Appointment does not exist");
        else
        appointmentRepository.deleteById(appointmentId);
    }
    
    
    
}
