package com.company;

public class Food extends Product {

    public Food(String brand, String title,  double price, int quantity) {
        super("Tech", brand, title, price, quantity);
    }

    @Override
    public String getInfo() {
        return "Tech contains: " + getBrand() + ", " + getTitle() + ", " + getPrice()+ ", " + getQuantity();

    }
}
