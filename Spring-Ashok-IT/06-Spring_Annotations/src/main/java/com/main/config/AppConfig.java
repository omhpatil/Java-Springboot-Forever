package com.main.config;

import com.main.beans.Robot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.main", "com.mains"})
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Constructor");
    }

    @Bean
    public Robot buildRobot() {
        Robot r = new Robot();
        return r;
    }

    // Here we have created the robot object by ourself and bean annotation is method annoatation not a class level.
    // Swagger configuration is best example for this.
}
