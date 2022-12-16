package com.example.demo.medicine;

import jakarta.persistence.*;


@Entity
@Table(name="medicines")
public class Medicine{
    @Id
    @SequenceGenerator(
            name= "medicine_sequence",
            sequenceName= "medicine_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "medicine_sequence"
    )
    private long id;
    private String name;
    private String category;

    public Medicine(){

    }


    public Medicine(long id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
