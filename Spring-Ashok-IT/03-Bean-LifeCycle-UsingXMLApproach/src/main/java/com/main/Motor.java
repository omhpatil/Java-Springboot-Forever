package com.main;

public class Motor {

    public Motor() {
        System.out.println("Motor : Constructor");
    }

    public void start() {
        System.out.println("Motor Started");
    }

    public void doWork() {
        System.out.println("Motor pulling water");
    }

    public void stop() {
        System.out.println("Motor Stopped");
    }
}
