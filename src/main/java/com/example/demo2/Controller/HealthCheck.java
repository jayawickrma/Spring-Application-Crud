package com.example.demo2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v2/health")
@RestController
public class HealthCheck {
    @GetMapping
    public String gethealthCheck(){
        return "API is working";
    }
}
