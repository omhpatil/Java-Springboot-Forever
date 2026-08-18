package com.main.controller;

import com.main.entity.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @PostMapping
    public Product createProduct(
            @RequestBody Product product,
            @RequestHeader("Authorization") String token) {

        System.out.println("Authorization: " + token);

        return product;
    }

    @GetMapping("/{id}")
    public String getProduct(
            @PathVariable Integer id,
            @RequestParam String category,
            @RequestHeader("Authorization") String token) {

        return "Product ID: " + id +
                ", Category: " + category +
                ", Token: " + token;
    }
}