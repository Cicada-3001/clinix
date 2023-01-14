package main.java.com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import static main.java.com.example.demo.Shared.BASEURL;
@CrossOrigin(origins = BASEURL)
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

    
    @RequestMapping("/login")
    @GetMapping()
    User getUsers(@RequestParam String  email,@RequestParam String password){
        return userService.loginUser(email,password);
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
