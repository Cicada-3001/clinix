package com.example.demo.user;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    List<User> getUsers(){
        return userRepository.findAll();
    }

    public void  addNewUser(User user){
      Optional<User> userOptional= userRepository.findUserByEmail(user.getUserEmail());

      if(userOptional.isPresent()){
          // throw new IllegalStateException("email taken");
           System.out.println("Username is taken");
       }
        userRepository.save(user);
    }

    public void deleteUser(Long userId){
        boolean exists = userRepository.existsById(userId);
        if(!exists){
            throw new IllegalStateException("User with id "+ userId +" does not exist");
        }
        userRepository.deleteById(userId);
    }


    @Transactional
    public void updateUser(Long userId, String username, String userEmail){
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalStateException(
                        "user with id " + userId + "does not exist"
                ));

        if(userEmail !=null  && userEmail.length() > 0 &&
                !Objects.equals(user.getUserEmail(), userEmail)) {
                user.setUserEmail(userEmail);
        }
        }






}






