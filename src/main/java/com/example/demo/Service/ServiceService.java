package com.example.demo.Service;

import java.util.List;


import com.example.demo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ServiceService {
    private final ServiceRepository serviceRepository;
    @Autowired
    public ServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }
    List<com.example.demo.Service.Service> getServices(){
        return  serviceRepository.findAll();
    }


    public void  addNewService(com.example.demo.Service.Service service){
        System.out.println(service);
    }


    public void updateService(Long serviceId, String serviceType, String serviceName) {
    }
}
