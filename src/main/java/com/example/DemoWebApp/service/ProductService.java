package com.example.DemoWebApp.service;

import com.example.DemoWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(new Product(101, "iPhone", 50000), new Product(102,"Canon", 70000));
    public List<Product> getProducts() {
        return products;
    }
}
