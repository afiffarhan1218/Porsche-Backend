package com.porsche.website;

import org.springframework.data.jpa.repository.JpaRepository;

// This interface gives you free methods to save, delete, and find arrays of cars
public interface CarRepository extends JpaRepository<Car, Long> {
}