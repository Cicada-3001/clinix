package com.example.demo.specility;


import com.example.demo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "/specialities")
public class SpecialityController {
    private final SpecialityService specialityService;

    @Autowired
    public SpecialityController(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @GetMapping
    List<Speciality> getSpecialities(){
        return specialityService.getSpecialities();
    }

    @PostMapping()
    public void createSpeciality(@RequestBody Speciality speciality){
        this.specialityService.addNewSpeciality(speciality);
    }


    @PutMapping(path = "{specialityId}")
    public void updateSpeciality(
            @PathVariable("specialityId") Long specialityId,
            @RequestParam(required = false) String name

    ){
        specialityService.updateSpeciality(specialityId, name);
    }





}
