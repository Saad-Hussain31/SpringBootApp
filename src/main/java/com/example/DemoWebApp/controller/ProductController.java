package com.example.DemoWebApp.controller;

import com.example.DemoWebApp.model.Product;
import com.example.DemoWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }
}
