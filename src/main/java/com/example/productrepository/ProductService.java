package com.example.productrepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {

        this.repository = repository;
    }

    public List<Product> findAllProducts() {

        return repository.findAll();
    }

    public Product addProduct(NewProduct newProduct) {

        Product product = new Product(UUID.randomUUID().toString(), newProduct.title(), newProduct.price());
        System.out.println(product+"Hier");
        repository.save(product);
        return product;
    }
}
