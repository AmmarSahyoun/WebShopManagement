package com.company;

public class Cart extends Repository{


    @Override
    public int getTotal(Product product) {
        int totalProducts = 0;
        for (Product product1 : getProducts()) {
            totalProducts += product1.getPrice();
        }
        return totalProducts;

    }
}


