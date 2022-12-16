package com.example.demo.specility;


import jakarta.persistence.*;

@Entity
@Table(name="specialities")
public class Speciality {



    @Id
    @SequenceGenerator(
            name= "speciality_sequence",
            sequenceName= "speciality_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "speciality_sequence"
    )
    private long id;
    private String name;

    public Speciality(){

    }

    public Speciality(long id, String name) {
        this.id = id;
        this.name = name;
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
}
