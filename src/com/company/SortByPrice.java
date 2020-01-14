package com.company;

import java.util.Comparator;

public class SortByPrice implements Comparator<Product> {

    public int compare(Product a1, Product a2){
        return (int)(a1.getPrice()- a2.getPrice());
    }


}
