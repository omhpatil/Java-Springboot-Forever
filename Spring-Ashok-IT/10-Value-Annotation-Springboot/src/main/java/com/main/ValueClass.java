package com.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueClass {

    // 1. Read value from application.properties
    @Value("${app.name}")
    private String appName;

    @Value("${server.port}")
    private int port;

    // 2: Direct Value Injection
    @Value("Om")
    private String name;

    @Value("26")
    private int age;

    // 3: Default Value
    @Value("${student.city:Pune}")
    private String city;

    public void display() {
        System.out.println("===== @Value Annotation Demo =====");
        System.out.println("Application Name : " + appName);
        System.out.println("Server Port      : " + port);
        System.out.println("Student Name     : " + name);
        System.out.println("Student Age      : " + age);
        System.out.println("Student City     : " + city);
    }
}
