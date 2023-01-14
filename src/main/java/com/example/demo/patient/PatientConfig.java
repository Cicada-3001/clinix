package main.java.com.example.demo.patient;



import main.java.com.example.demo.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PatientConfig {
    @Bean
    CommandLineRunner patientCommandLineRunner(PatientRepository patientRepository){
        return args -> {
            Patient unknown1= new Patient("Firstname", "Unknown1", "name", "address1", "Group AB", "Female");
            Patient unknown2= new Patient("Secondname", "Unknown2", "name", "address2", "Group O", "Male");
            patientRepository.saveAll(
                    List.of(unknown1, unknown2)
            );
        };
    }
}







