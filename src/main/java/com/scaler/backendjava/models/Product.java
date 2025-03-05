package com.scaler.backendjava.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private Long id;
    private String title;
    private String description;
    private Double price;
    private String image;
    private Category category;

    public Product() {
    }

    public Product(Long id, String title, String description, Double price, String image, Category category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.image = image;
        this.category = category;
    }
}
