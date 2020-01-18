package com.company;

public class Inventory extends Repository {

    @Override
    public void getInventoryInfo() {
        for (Product product : getProducts()) {
            System.out.println(product.getInfo());
        }
    }

    @Override
    public String getTotal() {
        double totalProducts = 0;
        double total = 0;
        for (Product product1 : getProducts()) {
            totalProducts += (product1.getPrice() * product1.getQuantity());
            total += totalProducts ;
        }
        return "the inxentory tptal is: " + total ;
    }
}