package com.example.demo.user;


import com.example.demo.patient.Patient;
import com.example.demo.patient.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping()
    public void registerNewUser(@RequestBody User user){
        this.userService.addNewUser(user);
    }

    @DeleteMapping(path = "{userId}")
    public void deleteUser(@PathVariable("userId") Long userId){
        userService.deleteUser(userId);
    }

    @PutMapping(path = "{userId}")
    public void updateUser(
            @PathVariable("userId") Long userId,
            @RequestParam(required = false) String userName,
            @RequestParam(required = false) String userEmail){
        userService.updateUser(userId, userName, userEmail);
    }





}
