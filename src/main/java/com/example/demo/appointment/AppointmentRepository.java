package main.java.com.example.demo.appointment;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import main.java.com.example.demo.user.User;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    @Query("SELECT  app from Appointment  app where app.number= ?1")
     Optional <Appointment>  findByNumber(Integer number);
    
    
    @Query("SELECT  app from Appointment  app where app.clinicId= ?1")
     List <Appointment>  findAllByClinicId(Integer number);
    
   
    @Query("SELECT  app from Appointment  app where app.patientId= ?1")
     List <Appointment>  findAllByPatientId(Integer number);
    
    
    @Query("SELECT  app from Appointment  app where app.doctorId= ?1")
    List <Appointment>  findAllByDoctorId(Integer number);
    
    

}
