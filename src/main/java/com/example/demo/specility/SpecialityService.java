package com.example.demo.specility;


import com.example.demo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialityService {
    private final SpecialityRepository specialityRepository;

    @Autowired
    public SpecialityService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    List<Speciality> getSpecialities(){
        return specialityRepository.findAll();
    }

    public void  addNewSpeciality(Speciality speciality){
        System.out.println(speciality);
    }

    public void updateSpeciality(Long specialityId, String name) {
    }
}
