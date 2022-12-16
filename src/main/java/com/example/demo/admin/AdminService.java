package com.example.demo.admin;

import com.example.demo.patient.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    private final AdminRepository adminRepository;
    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }
    List<Admin> getAdmins(){
        return adminRepository.findAll();
    }

    public void  addNewAdmin(Admin admin){
        System.out.println(admin);
    }

}
