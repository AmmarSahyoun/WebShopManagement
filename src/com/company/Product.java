package com.company;

public abstract class Product {

    private String title;
    private String category;
    private double price;
    private String brand;
    private int quantity;

    public Product(String category, String brand, String title, double price, int quantity) {
        this.title = title;
        this.category = category;
        this.price = price;
        this.brand = brand;
        this.quantity = quantity;
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

    public int getQuantity() {
        return quantity;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract String getInfo();

}

