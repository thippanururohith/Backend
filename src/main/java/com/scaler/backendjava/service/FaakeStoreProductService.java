package com.scaler.backendjava.service;

import com.scaler.backendjava.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaakeStoreProductService implements ProductService{

    public Product getSingleProduct(long id) {
         return null;
    }


    public List<Product> getAllProducts() {
        return List.of();
    }


    public Product createProduct(Product product) {
        return null;
    }
}
