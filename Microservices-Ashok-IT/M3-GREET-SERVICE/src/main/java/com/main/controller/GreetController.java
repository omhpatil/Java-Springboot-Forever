package com.main.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    private final Environment environment;

    public GreetController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/greet")
    public String greet() {

        String port = environment.getProperty("server.port");

        System.out.println("Request processed by GREET-SERVICE on port: " + port);

        return "Hello, Good Evening - Response from port: " + port;
    }
}