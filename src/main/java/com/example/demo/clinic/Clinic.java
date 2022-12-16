package com.example.demo.clinic;


import jakarta.persistence.*;

@Entity
@Table(name="clinics")
public class Clinic {
    @Id
    @SequenceGenerator(
            name= "clinic_sequence",
            sequenceName= "clinic_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "clinic_sequence"
    )

    private long id;
    private String name;
    private String location;
    private String coordinates;

    public Clinic(){

    }

    public Clinic(long id, String name, String location, String coordinates) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.coordinates = coordinates;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }
}
