package com.company;

import org.w3c.dom.ls.LSOutput;

public class Cart extends Repository {

    @Override
    public void getInventoryInfo() {
    }

    @Override
    public String getTotal() {
        double totalProducts = 0;
        double total = 0;
        for (Product product1 : getProducts()) {
            totalProducts += (product1.getPrice() * product1.getQuantity());
            total += totalProducts;
        }
        return  "the cart total price: " + total  ;

    }
}


