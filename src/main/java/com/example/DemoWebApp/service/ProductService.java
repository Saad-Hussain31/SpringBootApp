package com.example.DemoWebApp.service;

import com.example.DemoWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101,
            "iPhone", 50000),
            new Product(102,"Canon", 70000)));
    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst()
                .orElse(new Product (100,"No Item", 0));
    }

//    public Product getProductById(int prodId, boolean returnDefault) { // Overloaded method
//        return products.stream()
//                .filter(p -> p.getProdId() == prodId)
//                .findFirst()
//                .orElse(returnDefault ? new Product(100, "No Item", 0) : null);
//    }

    public void addProduct(Product prod) {
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index =0;
        for(int i=0; i<products.size(); i++) {
            if(prod.getProdId() == products.get(i).getProdId()) {
                index = i;
            }
        }
        products.set(index, prod);
    }

    public void deleteProduct(int prodId) {
        int index =0;
        for(int i=0; i<products.size(); i++) {
            if(prodId == products.get(i).getProdId()) {
                index = i;
            }
        }
        products.remove(index);
    }
}
