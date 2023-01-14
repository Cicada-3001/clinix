package main.java.com.example.demo.user;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner userCommandLineRunner(UserRepository userRepository){
        return args -> {
           User romeo= new User("Romeo Claudde","0740226539", "claudde@gmail.com", "claudde", 1);
           User junior= new User("Jan Junior","0712345678", "jan@gmail.com", "jan", 1);
           User jamal= new User("Jamal Junior","0712345678", "jamal@gmail.com", "jamal", 2);
           
           userRepository.saveAll(
                   List.of(romeo,junior, jamal)
           );
        };
    }



}
