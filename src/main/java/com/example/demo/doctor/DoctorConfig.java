package com.example.demo.doctor;


import com.example.demo.user.User;
import com.example.demo.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DoctorConfig{
    @Bean
    CommandLineRunner doctorCommandLineRunner(DoctorRepository doctorRepository){
        return args -> {
            Doctor braque= new Doctor(1L, "Renoir", "Leger", "Gastrology", 1);
            Doctor renoir= new Doctor(2L, "Braque", "Auguste", "Cardiology", 1);
            doctorRepository.saveAll(
                    List.of(braque, renoir)
            );
        };
    }


}





