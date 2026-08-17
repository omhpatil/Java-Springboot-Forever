package com.main.repository;

import com.main.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "call getProducts()", nativeQuery = true)
    List<Product> getProducts();
}