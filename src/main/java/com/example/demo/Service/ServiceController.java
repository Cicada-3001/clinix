package main.java.com.example.demo.Service;


import main.java.com.example.demo.patient.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static main.java.com.example.demo.Shared.BASEURL;

@CrossOrigin(origins = BASEURL)
@RestController
@RequestMapping(path="/services")
public class ServiceController {
    private final ServiceService serviceService;

    @Autowired
    public ServiceController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @GetMapping()
    List<Service> getServices(){
        return serviceService.getServices();
    }

    @PostMapping()
    public void createService(@RequestBody Service service){
        this.serviceService.addNewService(service);
    }

    @PutMapping(path = "{serviceId}")
    public void updateService(
            @PathVariable("serviceId") Long serviceId,
            @RequestParam(required = false) String serviceType,
            @RequestParam(required = false) String serviceName
    ){
        serviceService.updateService(serviceId, serviceType, serviceName);
    }


}
