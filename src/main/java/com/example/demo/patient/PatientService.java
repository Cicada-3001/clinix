package main.java.com.example.demo.patient;

import main.java.com.example.demo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PatientService {

    private final PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    List<Patient> getPatients() {
        return   patientRepository.findAll();
    }


    public void  addNewPatient(Patient patient){
        System.out.println(patient);
    }


    public void updatePatient(Long patientId, String firstname, String lastname, String address, String dob, String blood, String sex) {
    }
}
