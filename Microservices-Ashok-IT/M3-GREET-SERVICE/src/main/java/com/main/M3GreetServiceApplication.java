package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class M3GreetServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(M3GreetServiceApplication.class, args);
    }
}