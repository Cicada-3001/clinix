package main.java.com.example.demo.doctor;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DoctorConfig{
    @Bean
    CommandLineRunner doctorCommandLineRunner(DoctorRepository doctorRepository){
        return args -> {
            Doctor jan= new Doctor("Verma", "Jan", "Gastrology", 1,10,"../../../assets/images/user-2.jpg" );
            Doctor vanessa= new Doctor("Jean", "Vanessa", "Cardiology", 2,5,"../../../assets/images/user-4.jpg");
            Doctor marcel= new Doctor("Marcel", "Matt", "Cardiology", 3,4,"../../../assets/images/user-3.jpg");
            
            doctorRepository.saveAll(
                    List.of(jan,vanessa,marcel)
            );
        };
    }


}





