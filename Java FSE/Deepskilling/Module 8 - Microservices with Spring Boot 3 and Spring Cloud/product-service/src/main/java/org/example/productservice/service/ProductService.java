package org.example.productservice.service;

import org.example.productservice.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public Product getProduct(int id) {
        return new Product(id, "Laptop", 65000.0);
    }
}