package com.main.controller;

import com.main.client.GreetClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private final GreetClient greetClient;

    public WelcomeController(GreetClient greetClient) {
        this.greetClient = greetClient;
    }

    @GetMapping("/welcome")
    public String welcome() {

        String greetResponse = greetClient.getGreeting();

        return greetResponse + " | Welcome to Feign Client Implementation from M4-Microservice";
    }
}