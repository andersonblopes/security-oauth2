package com.lopes.spring.securityoauth2.controller;

import com.lopes.spring.securityoauth2.model.Car;
import com.lopes.spring.securityoauth2.model.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping
    public List<Car> test() {
        Car car = new Car(1L, "Ferrari", 2020);
        carRepository.save(car);
        return carRepository.findAll();
    }
}
