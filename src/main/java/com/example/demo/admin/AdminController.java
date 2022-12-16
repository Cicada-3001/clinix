package com.example.demo.admin;


import com.example.demo.user.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/admins")
public class AdminController {
    private final  AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }


    @GetMapping()
    List<Admin> getAdmins(){
        return adminService.getAdmins();
    }


    @PostMapping()
    public void createAdmin(@RequestBody Admin admin){
        this.adminService.addNewAdmin(admin);
    }

}
