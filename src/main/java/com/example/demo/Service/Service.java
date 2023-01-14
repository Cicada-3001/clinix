package main.java.com.example.demo.Service;

import jakarta.persistence.*;


@Entity
@Table(name="services")
public class Service {
    @Id
    @SequenceGenerator(
            name= "service_sequence",
            sequenceName= "service_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "service_sequence"
    )
    private long id;
    private String serviceName;

    public Service(){

    }


    public Service(String serviceName) {
        this.serviceName = serviceName;
    }
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
