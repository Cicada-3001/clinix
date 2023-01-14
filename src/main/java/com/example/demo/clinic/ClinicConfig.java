package main.java.com.example.demo.clinic;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ClinicConfig {
    @Bean
    CommandLineRunner clinicCommandLineRunner(ClinicRepository clinicRepository){
        return args -> {
            Clinic clinic1= new Clinic("Incare Clinic", "Nairobi", "We take pride in our highly qualified "
            		+ "professionals who deliver our mission every day, translating their"
            		+ " knowledge and expertise to internationally compliant practices in "
            		+ "healthcare provision. Courtesy, consideration and unreserved respect"
            		+ " towards our patients’ privacy, dignity and confidentiality have helped "
            		+ "us earn their trust and goodwill time and again. Our dedicated nursing staff"
            		+ " provides professional care within a friendly and comfortable environment, "
            		+ "ensuring a pleasant and anxiety-free"
            		+ " time in hospital for our patients and their"
            		+ " families.","Kindaruma Lane, Kilimani, Nairobi","Running to the future","contact.nairobi@clinicx.org.","+2547222997","../../../assets/images/clinicX7.jpg","https://goo.gl/maps/wsDmH2rg7ahJifTq5");
            
            
            Clinic clinic2=new Clinic("Serenity South Clinic", "Nakuru","Our staff is well trained, caring and professional. Each and every one of us respects the diversity and dignity of our patients. We welcome advances in learning and technology in an effort to achieve efficient and quality-driven patient care.\r\n"
            		+ "\r\n"
            		+ "Together our team of doctors bring a broad spectrum of experience and"
            		+ "professional expertise and continually undertake professional development education to remain up to date with the latest in medical treatment options.\r\n"
            		+ "\r\n"
            		+ "We aim to make all patients feel welcome whilst providing high quality, professional medical care in a friendly environment. Although it may not always be possible to see your preferred doctor, our doctors work together as a team to make sure your ongoing health needs are met.\r\n"
            		+ "\r\n"
            		+ "ACCEPTED INSURANCE:\r\n"
            		+ "equity-insurance-logo\r\n"
            		+ "FA-insurance-logo\r\n"
            		+ "minet-insurance-logo\r\n"
            		+ "TSC-logo\r\n"
            		+ "", "Show Ground Rd, Nakuru","Together in Community","contact.nakuru@clinicx.org.","+25470009998","../../../assets/images/clinicX4.jpg","https://goo.gl/maps/8WEN43Z8ni85D6RB7" );
            
            
            Clinic clinic3= new Clinic("YouHeal Medical", "Kisumu", "We believe that our staff is the most valuable"
            		+ " asset, and their health and safety are of utmost importance to deliver on our mandate. "
            		+ "We are committed to ensuring a quality patient experience and acknowledge that your "
            		+ "feedback is one of the best ways for us to know where we are "
            		+ "doing well and where we are not","Otieno Oyoo St, Kisumu","Changing and growing with you","contact.kisumu@clinicx.org.","+25470002222","../../../assets/images/clinicX2.jpg","https://goo.gl/maps/UGhss578o4vwgJYk8");
     
            
            clinicRepository.saveAll(
                    List.of(clinic1, clinic2,clinic3)
            );
        };
    }







}

