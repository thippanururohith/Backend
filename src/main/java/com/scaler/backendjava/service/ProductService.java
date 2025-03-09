package com.scaler.backendjava.service;

import com.scaler.backendjava.models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(long id);
    List<Product> getAllProducts();
    Product createProduct(Product product);
}
