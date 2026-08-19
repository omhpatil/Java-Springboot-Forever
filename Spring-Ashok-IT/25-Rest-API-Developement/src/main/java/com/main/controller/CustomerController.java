package com.main.controller;

import com.main.entity.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    public CustomerController() {
        System.out.println("CustomerController Constructor");
    }

    @GetMapping("/")
    public ResponseEntity<String> getWelcomeMsg() {
        return new ResponseEntity<>("Welcome to API Developement", HttpStatus.OK);
    }

    @GetMapping("/greet")
    public String getGreetMsg() {
        return "Hey, Good Evening!!";
    }

    @GetMapping("/customer")
    public Customer getCustomer() {
        //here controller returns a Java object, and Jackson serializes it into JSON for the HTTP response.
        Customer customer = new Customer();
        customer.setName("Om");
        customer.setEmail("patilom887@gmail.com");
        customer.setGender("Male");

        return customer;
    }
}
