package main.java.com.example.demo.Service;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ServiceService {
    private final ServiceRepository serviceRepository;
    @Autowired
    public ServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }
    List<main.java.com.example.demo.Service.Service> getServices(){
        return  serviceRepository.findAll();
    }


    public void  addNewService(main.java.com.example.demo.Service.Service service){
        System.out.println(service);
    }


    public void updateService(Long serviceId, String serviceType, String serviceName) {
    }
}
