package com.company;

public class Tech extends Product{

    public Tech(String brand, String title,  double price, int quantity){
        super("Tech",brand, title, price, quantity);
    }

    @Override
    public String getInfo() {
        return "Tech contains: " + getBrand() + ", " + getTitle() + ", " + getPrice()+ ", " + getQuantity();
    }
}
