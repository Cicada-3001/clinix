package main.java.com.example.demo.medicine;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
