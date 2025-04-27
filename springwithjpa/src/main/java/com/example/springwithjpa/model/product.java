package com.example.springwithjpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity


public class product {
    public product(Long id, String name, String catogory, Double price) {
        this.id = id;
        this.name = name;
        this.catogory = catogory;
        this.price = price;
    }

    @Id
    private Long id;
    private String name;
    private String catogory;
    private Double price;

    public product() {
       // this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatogory() {
        return catogory;
    }

    public void setCatogory(String catogory) {
        this.catogory = catogory;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
