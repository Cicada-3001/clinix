package main.java.com.example.demo.Service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ServiceConfig {
    @Bean
    CommandLineRunner commandLineRunner(ServiceRepository serviceRepository){
        return args -> {
            Service  serve1= new Service("cardiology");
            Service serve2=new Service("dentistry");
            Service  serve3= new Service("gastroenterology");
            Service serve4=new Service("neurology");
            Service  serve5= new Service("oncology");
            Service serve6=new Service("podiatry");
            Service  serve7= new Service("urology");
            Service serve8=new Service("orthopedics");
            Service  serve9= new Service("cardiology");
            Service serve10=new Service("gynecology and obstetrics");
            
            serviceRepository.saveAll(
                    List.of(serve1, serve2, serve3, serve4, serve5, serve6
                    		,serve7, serve8, serve9, serve10)
            );
        };
    }
 
}
