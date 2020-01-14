package com.company;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Product> myCarts = new ArrayList<>();


    public void addProduct(Product product) {
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void getInfo() {
        for (Product product : products) {
            System.out.println(product.getInfo());
        }
    }

    public void getTotal() {
        double totalMoney = 0;

        for (Product product : products) {

            totalMoney += product.getPrice();
        }
        System.out.println("total cart , " + totalMoney);
    }

}


