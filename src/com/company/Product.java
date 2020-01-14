package com.company;

public abstract class Product {
    private String title;
    private String category;
    private double price;
    private String brand ;



    public Product(String category, String brand, String title, double price) {
        this.title = title;
        this.category = category;
        this.price = price;
        this.brand = brand ;

    }

    public String getTitle() {
        return title;
    }
    public String getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }


    public abstract String getInfo();
}