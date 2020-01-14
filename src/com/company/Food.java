package com.company;

public class Food extends Product {

    public Food(String brand, String title,  double price) {
        super("Food", brand, title, price);
    }

    @Override
    public String getInfo() {
        return "Food contains: "+ getBrand() + ", " + getTitle() + ", "+ getPrice();

    }
}
