package com.company;

public class Furniture extends Product {

    public Furniture(String brand, String title, double price, int quantity) {
        super("Furniture", brand, title, price, quantity);
    }

    @Override
    public String getInfo() {
        return "Furniture contains: " + getBrand() + ", " + getTitle() + ", " + getPrice() + ", " + getQuantity();
    }
}