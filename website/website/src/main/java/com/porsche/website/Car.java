package com.porsche.website;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Spring to turn this class into a database table
public class Car {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Private visibility modifier keeps data secure
    
    private String model;
    private String engine;
    private int horsepower;
    private String price;

    // These getter methods allow other parts of the app to read the data safely
    public Long getId() { return id; }
    public String getModel() { return model; }
    public String getEngine() { return engine; }
    public int getHorsepower() { return horsepower; }
    public String getPrice() { return price; }
}