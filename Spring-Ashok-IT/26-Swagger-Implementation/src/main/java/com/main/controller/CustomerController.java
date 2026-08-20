package com.main.controller;

import com.main.entity.Customer;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    public CustomerController() {
        System.out.println("CustomerController Constructor");
    }

    @Operation(
            summary = "Get welcome message",
            description = "Returns a welcome message for the API"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Welcome message returned successfully"
    )
    @GetMapping("/")
    public ResponseEntity<String> getWelcomeMsg() {

        return new ResponseEntity<>(
                "Welcome to API Development",
                HttpStatus.OK
        );
    }


    @Operation(
            summary = "Get greeting message",
            description = "Returns a greeting message"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Greeting message returned successfully"
    )
    @GetMapping("/greet")
    public String getGreetMsg() {

        return "Hey, Good Evening!!";
    }


    @Operation(
            summary = "Get customer",
            description = "Returns customer information"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Customer information retrieved successfully"
    )
    @GetMapping("/customer")
    public Customer getCustomer() {

        Customer customer = new Customer();

        customer.setName("Om");
        customer.setEmail("patilom887@gmail.com");
        customer.setGender("Male");

        return customer;
    }
}