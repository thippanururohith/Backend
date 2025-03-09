package com.scaler.backendjava;

import com.scaler.backendjava.models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendJavaApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(BackendJavaApplication.class, args);

        Product p = new Product();

    }

}
