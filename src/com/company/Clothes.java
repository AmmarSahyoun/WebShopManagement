package com.company;

public class Clothes extends Product {

    public Clothes(String brand, String title, double price){
        super("Clothes", brand, title, price);
    }

    @Override
    public String getInfo() {
       return "Clothes contains: "+ getBrand() + ", "+ getTitle() + ", " + getPrice();
    }
}
