package com.example.demo.doctor;

import com.example.demo.patient.Patient;
import com.example.demo.patient.PatientService;
import com.example.demo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.demo.Shared.BASEURL;

@CrossOrigin(origins = BASEURL)
@RestController
@RequestMapping(path = "/doctors")
public class DoctorController {
    private final DoctorService doctorService;

    @Autowired
    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping()
    List<Doctor> getDoctors(){
        return doctorService.getDoctors();
    }

    @PostMapping()
    public void createDoctor(@RequestBody Doctor doctor){
        this.doctorService.addNewDoctor(doctor);
    }


    @DeleteMapping(path = "{doctorId}")
    public void deleteDoctor(@PathVariable("doctorId") Long doctorId){
        doctorService.deleteDoctor(doctorId);
    }


    @PutMapping(path = "{doctorId}")
    public void updateDoctor(
            @PathVariable("doctorId") Long doctorId,
            @RequestParam(required = false) String firstname,
            @RequestParam(required = false) String lastname,
            @RequestParam(required = false) String speciality,
            @RequestParam(required = false)  Long clinicId){
        doctorService.updateDoctor(doctorId, firstname, lastname, speciality, clinicId);
    }




}
