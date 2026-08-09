package com.beans;

public class Car {

    private IEngine engine;

    public Car() {
        System.out.println("Car Engine Constructor");
    }

    public void setEngine(IEngine engine) {
        System.out.println("setEngine() method is called");
        this.engine = engine;
    }

    public void drive() {
        int start = engine.start();

        if (start >= 1) {
            System.out.println("Journey Started");
        } else {
            System.out.println("Engine Failed");
        }
    }


}
