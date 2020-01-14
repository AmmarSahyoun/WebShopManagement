package com.company;

import java.util.Collections;

public class Program {

    public Program(){

        Cart cart = new Cart();

        cart.addProduct(new Food("Nestle", "Milky",30));
        cart.addProduct(new Tech("Sony", "TV",7000));
        cart.addProduct(new Tech("HP", "laptop",12000));
        cart.addProduct(new Clothes("Jack & Jones", "Jacket", 1200));
        cart.addProduct(new Furniture("IKEA", "Sofa", 2100));

        Collections.sort(cart.getProducts(), new SortByPrice());
        cart.getInfo();

        Collections.sort(cart.getProducts(), new SortByName());
        cart.getInfo();
    }
}
