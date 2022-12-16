package com.example.demo.clinic;

import com.example.demo.patient.Patient;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class ClinicService {
    private final ClinicRepository clinicRepository;
    public ClinicService(ClinicRepository clinicRepository) {
        this.clinicRepository = clinicRepository;
    }
    List<Clinic> getClinics(){
        return List.of();
    }


    public void  addNewClinic(Clinic clinic){
        System.out.println(clinic);
    }


    public void deleteClinic(Long id){
        System.out.println("Deleted clinic");
    }


    public void updateClinic(Long clinicId, String name, String location, String coordinates) {
    }
}
