package com.scaler.backendjava.controller;

import com.scaler.backendjava.models.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    // CRUD apis around product

    //@RequestMapping(value = "/products", method = RequestMethod.Post)
    PostMapping("/products")
    public void createProduct(Product product) {

    }

    public Product getProduct(Long id) {

    }

    public void updateProduct(Product product) {

    }
    public void deleteProduct(Long id) {

    }
}
