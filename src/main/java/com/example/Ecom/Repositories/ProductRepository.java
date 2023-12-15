package com.example.Ecom.Repositories;

import com.example.Ecom.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;


public interface ProductRepository extends JpaRepository<Product,Long>{
    boolean existsByName(String name);
}
