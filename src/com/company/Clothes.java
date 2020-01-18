package com.company;

public class Clothes extends Product {

    public Clothes(String brand, String title, double price, int quantity) {
        super("Clothes", brand, title, price, quantity);
    }

    @Override
    public String getInfo() {
        return "Clothes contains: " + getBrand() + ", " + getTitle() + ", " + getPrice() + ", " + getQuantity();
    }
}