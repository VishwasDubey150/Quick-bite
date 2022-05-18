package com.example.quick_byte.Models;

public class MainModel {
    String name;
    String price;

    public MainModel(String name,String price) {
        this.name = name;
        this.price=price;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return String.valueOf(name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
