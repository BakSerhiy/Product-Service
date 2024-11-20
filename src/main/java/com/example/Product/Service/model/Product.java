package com.example.Product.Service.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Builder
@Data
@Document(collection = "products")
public class Product {
    @Id
    private String id;
    private String name;
    private double price;
    private int quantity;
}
