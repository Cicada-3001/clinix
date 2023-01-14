package main.java.com.example.demo.clinic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static main.java.com.example.demo.Shared.BASEURL;

import java.util.List;

@CrossOrigin(origins = BASEURL)
@RestController
@RequestMapping(path= "/clinics")
public class ClinicController {
  private final ClinicService clinicService;
    @Autowired
    public ClinicController(ClinicService clinicService) {
        this.clinicService = clinicService;
    }


    @GetMapping()
     List<Clinic> getClinics(){
        return clinicService.getClinics();
     }

    @PostMapping()
    public void createNewClinic(@RequestBody Clinic clinic){
        this.clinicService .addNewClinic(clinic);
    }

    @DeleteMapping(path = "{clinicId}")
    public void deleteClinic(@PathVariable("clinicId") Long clinicId){
        clinicService.deleteClinic(clinicId);
    }


    @PutMapping(path = "{clinicId}")
    public void updateDoctor(
            @PathVariable("clinicId") Long clinicId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String location,
            @RequestParam(required = false) String coordinates)
            {
        clinicService.updateClinic(clinicId, name, location, coordinates);
    }




}
