package com.main.runners;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Engine {

    public Engine() {
        System.out.println("Engine Constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("Init() method called");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy() method called");
    }
}
