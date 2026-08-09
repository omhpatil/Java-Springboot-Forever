package com.main;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Motor {

    public Motor() {
        System.out.println("Motor Contstrutor");
    }

    public void doWork() {
        System.out.println("Motor Pulling Water");
    }

    @PostConstruct
    public void startMotor() {
        System.out.println("Motor Started");
    }

    @PreDestroy
    public void stopMotor() {
        System.out.println("Motor Stopped");
    }
}
