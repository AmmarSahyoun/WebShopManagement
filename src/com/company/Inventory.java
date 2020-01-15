package com.company;

public class Inventory extends Repository {

    @Override
    public void getInventoryInfo() {
        for (Product product : getProducts()) {
            System.out.println(product.getInfo());
        }
    }
}