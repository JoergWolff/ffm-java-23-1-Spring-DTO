package com.example.productrepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {

        this.repository = repository;
    }

    public List<Product> findAllProducts() {

        return repository.findAll();
    }
}
