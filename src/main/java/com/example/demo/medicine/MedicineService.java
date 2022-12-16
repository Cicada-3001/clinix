package com.example.demo.medicine;

import com.example.demo.patient.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MedicineService {
    private final MedicineRepository medicineRepository;

    @Autowired
    public MedicineService(MedicineRepository medicineRepository) {
        this.medicineRepository = medicineRepository;
    }
    List<Medicine> getMedicines(){
        return medicineRepository.findAll();
    }


    public void  addNewMedicine(Medicine medicine){
        System.out.println(medicine );
    }

    public void updateMedicine(Long medicineId, String name, String category) {
    }
}
