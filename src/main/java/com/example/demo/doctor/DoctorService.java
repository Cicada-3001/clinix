package com.example.demo.doctor;

import com.example.demo.patient.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    private final DoctorRepository doctorRepository;
    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    List<Doctor> getDoctors() {
        return doctorRepository.findAll();
    }

    public void  addNewDoctor(Doctor doctor){
        System.out.println(doctor);
    }

    public void deleteDoctor(Long id){
        System.out.println("Deleted doctor");
    }


    public  void updateDoctor(long id, String firstname, String lastname, String speciality, long clinicId) {

    }





}