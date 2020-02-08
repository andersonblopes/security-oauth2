package com.lopes.spring.securityoauth2.model.repository;

import com.lopes.spring.securityoauth2.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
