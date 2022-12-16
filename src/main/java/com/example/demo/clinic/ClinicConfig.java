package com.example.demo.clinic;

import com.example.demo.Service.Service;
import com.example.demo.Service.ServiceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ClinicConfig {
    @Bean
    CommandLineRunner clinicCommandLineRunner(ClinicRepository clinicRepository){
        return args -> {
            Clinic clinic1= new Clinic(1L, "Clinic 1", "Nairobi", "Nakuru City" );
            Clinic clinic2=new Clinic(2L, "Clinic 2", "Nakuru", "Nakuru City");
            clinicRepository.saveAll(
                    List.of(clinic1, clinic2)
            );
        };
    }







}

