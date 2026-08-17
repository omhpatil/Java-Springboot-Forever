package com.main;

import com.main.entity.Product;
import com.main.repository.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        ProductRepository studentRepository = context.getBean(ProductRepository.class);

        List<Product> products = studentRepository.getProducts();
        products.forEach(System.out::println);
    }
}