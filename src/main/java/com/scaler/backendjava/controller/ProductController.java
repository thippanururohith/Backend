package com.scaler.backendjava.controller;

import com.scaler.backendjava.models.Product;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;

@RestController
public class ProductController {
    // CRUD apis around product

    //@RequestMapping(value = "/products", method = RequestMethod.Post)
    @PostMapping("/products")
    public void createProduct(Product product) {

    }

    @GetMapping(="/products/{id}")
    public Product getProduct(@PathVariable("id") Long id)
    {


    }

    public void updateProduct(Product product) {

    }
    public void deleteProduct(Long id) {

    }
    @RequestMapping(value="/Productslist",method = RequestMethod.GET)
    public int[] listAllProducts() {
        int[] a= {} ;
        return a;
    }
}
