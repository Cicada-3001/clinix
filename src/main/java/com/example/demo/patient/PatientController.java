package com.example.demo.patient;


import com.example.demo.user.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.demo.Shared.BASEURL;
@CrossOrigin(origins = BASEURL)
@RestController
@RequestMapping(path ="/patients")

public class PatientController {
    private final PatientService patientService;
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }



    @GetMapping()
    List<Patient> getPatients(){
        return patientService.getPatients();
    }
    @PostMapping()
    public void createPatient(@RequestBody Patient patient){
        this.patientService.addNewPatient(patient);
    }

    @PutMapping(path = "{patientId}")
    public void updateUser(
            @PathVariable("appointmentId") Long patientId,
            @RequestParam(required = false) String firstname,
            @RequestParam(required = false) String lastname,
            @RequestParam(required = false) String address,
            @RequestParam(required = false) String dob,
            @RequestParam(required = false) String blood,
            @RequestParam(required = false) String sex
    ){
        patientService.updatePatient(patientId, firstname, lastname, address, dob, blood, sex);
    }






}
