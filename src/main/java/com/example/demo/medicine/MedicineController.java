package com.example.demo.medicine;


import com.example.demo.patient.Patient;
import com.example.demo.patient.PatientService;
import com.example.demo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "/medicines")
public class MedicineController {

    private final MedicineService medicineService;

    @Autowired
    public MedicineController(MedicineService medicineService) {
        this.medicineService = medicineService;
    }

    @GetMapping()
    List<Medicine> getMedicines(){
        return medicineService.getMedicines();
    }

    @PostMapping()
    public void createMedicine(@RequestBody Medicine medicine){
        this.medicineService.addNewMedicine(medicine);
    }

    @PutMapping(path = "{medicineId}")
    public void updateUser(
            @PathVariable("medicineId") Long medicineId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String category
    ){
        medicineService.updateMedicine(medicineId, name, category);
    }



}
