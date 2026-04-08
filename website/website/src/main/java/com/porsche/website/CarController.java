package com.porsche.website;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Tells Spring this handles web traffic
@RequestMapping("/api/cars") // The web address for this logic
@CrossOrigin(origins = "*") // Security setting to let your HTML frontend talk to it
public class CarController {

    private final CarRepository repository;

    // Constructor to inject the database link
    public CarController(CarRepository repository) {
        this.repository = repository;
    }

    @GetMapping // Triggers when someone visits the /api/cars address
    public List<Car> getAllCars() {
        // Uses the repository to grab all cars and returns them as a list/array
        return repository.findAll(); 
    }
}