package com.example.Product.Service.service;

import com.example.Product.Service.model.Product;
import com.example.Product.Service.model.ProductBody;
import com.example.Product.Service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(String id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product addProduct(ProductBody productBody) {
        var product = Product.builder()
                .name(productBody.name())
                .price(productBody.price())
                .quantity(productBody.quantity())
                .build();
        return productRepository.save(product);
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
