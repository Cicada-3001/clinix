package com.example.demo.Service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ServiceConfig {
    @Bean
    CommandLineRunner commandLineRunner(ServiceRepository serviceRepository){
        return args -> {
            Service  serve1= new Service(1L, 1, "Labtest 1");
            Service serve2=new Service(2L, 2, "Labtest 2");
            serviceRepository.saveAll(
                    List.of(serve1, serve2)
            );
        };
    }
}
