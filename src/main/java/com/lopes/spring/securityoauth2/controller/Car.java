package com.lopes.spring.securityoauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class Car {

    @GetMapping
    public String test() {
        return "Hello!";
    }
}
