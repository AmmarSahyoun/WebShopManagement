package com.company;

public class Tech extends Product{

    public Tech(String brand, String title,  double price){
        super("Tech",brand, title, price);
    }

    @Override
    public String getInfo() {
        return "Tech contains: " + getBrand() + ", " + getTitle() + ", " + getPrice();
    }
}
