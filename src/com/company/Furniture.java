package com.company;

public class Furniture extends Product {

    public Furniture(String brand, String title,  double price){
        super("Furniture", brand, title, price);
    }

    @Override
    public String getInfo() {
       return "Furniture contains: "+ getBrand() +", "+ getTitle() + ", " + getPrice();
    }
}
