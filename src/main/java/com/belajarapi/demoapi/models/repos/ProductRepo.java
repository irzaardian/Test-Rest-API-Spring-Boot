package com.belajarapi.demoapi.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.belajarapi.demoapi.models.entities.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Long> {
    
    List<Product> findByNameContains(String name);
}
