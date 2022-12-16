package com.example.demo.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner userCommandLineRunner(UserRepository userRepository){
        return args -> {
           User pablo= new User(1L, "0740226539", "picasso@gmail.com", "picasso", 1);
           User picasso= new User(2L, "0712345678", "picasso@gmail.com", "picasso", 1);
           userRepository.saveAll(
                   List.of(pablo, picasso)
           );
        };
    }



}
