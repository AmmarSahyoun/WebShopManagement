package com.company;

public class Food extends Product {

    public Food(String brand, String title,  double price, int quantity) {
        super("Food", brand, title, price, quantity);
    }

    @Override
    public String getInfo() {
        return "Food contains: " + getBrand() + ", " + getTitle() + ", " + getPrice()+ ", " + getQuantity();

    }
}
