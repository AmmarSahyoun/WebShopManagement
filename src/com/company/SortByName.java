package com.company;

import java.util.Comparator;

public class SortByName implements Comparator<Product> {

    public int compare(Product aa,Product bb) {

        return aa.getTitle().toLowerCase().compareTo(bb.getTitle().toLowerCase());
    }
}
