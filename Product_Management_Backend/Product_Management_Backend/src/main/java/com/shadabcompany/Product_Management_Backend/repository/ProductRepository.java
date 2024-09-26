package com.shadabcompany.Product_Management_Backend.repository;

import com.shadabcompany.Product_Management_Backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
