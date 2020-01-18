package com.company;

import java.util.ArrayList;

public abstract class Repository {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public abstract void getInventoryInfo();

    public abstract String getTotal();

}


