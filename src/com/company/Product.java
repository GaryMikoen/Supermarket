package com.company;

public abstract class Product {
    protected double price;
    protected String name;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }
}
