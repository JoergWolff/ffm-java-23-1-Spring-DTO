package com.example.productrepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {

    private  final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping()
    public List<Product> getAllProducts(){
      return this.service.findAllProducts();
    }

    @PostMapping()
    public Product addNewProduct(@RequestBody NewProduct newProduct){
        System.out.println(newProduct);
        return service.addProduct(newProduct);

    }

}
