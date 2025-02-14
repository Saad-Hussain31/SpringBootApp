package com.example.DemoWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;


public class Product {
    private int prodId;
    private String prodName;
    private int price;

    public Product(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

    public int getProdId() {
        return prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", prodName='" + prodName + '\'' +
                ", prodId=" + prodId +
                '}';
    }
}
