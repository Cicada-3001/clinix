package com.example.demo.Service;

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
    private Integer serviceType;
    private String serviceName;

    public Service(){

    }


    public Service(long id, Integer serviceType, String serviceName) {
        this.id = id;
        this.serviceType = serviceType;
        this.serviceName = serviceName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getServiceType() {
        return serviceType;
    }

    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
