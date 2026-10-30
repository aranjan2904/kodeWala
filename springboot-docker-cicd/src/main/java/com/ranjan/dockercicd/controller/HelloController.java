package com.ranjan.dockercicd.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of(
                "message", "Hello from Spring Boot!",
                "application", "docker-cicd-demo",
                "status", "UP"
        );
    }

    @GetMapping("/version")
    public Map<String, String> version() {
        return Map.of(
                "springBoot", "4.0.0",
                "java", "21"
        );
    }
}
