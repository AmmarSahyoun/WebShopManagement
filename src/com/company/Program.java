package com.company;

import java.util.Scanner;

public class Program {

    public Program() {
        System.out.println("choose from list");

        Inventory inventory = new Inventory();

        inventory.addProduct(new Food("Nistle", "Milk", 35.9,6));
        inventory.addProduct(new Tech("Sony", "TV", 7000,3));
        inventory.addProduct(new Clothes("Jack & Jones", "Jacket", 1200,8));
        inventory.addProduct(new Furniture("IKEA", "Sofa", 2100,3));

 /*     Collections.sort(cart.getProducts(), new SortByPrice());
        cart.getInfo();

        Collections.sort(cart.getProducts(), new SortByName());
        cart.getInfo(); */

        int choice = 0;
        System.out.println();
        System.out.println("     ..: Welcome to WebShop Management :..");
        System.out.println(" 1. view the products");
        System.out.println(" 2. add new product");
        System.out.println(" 2. remove a product");

        System.out.println();
        boolean continueToRun = true;
        while (continueToRun) {
            Scanner scn = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scn.nextLine());
            } catch (NumberFormatException ex) {
                System.err.println("Wrong choice! ");
            } catch (Exception e) {
                System.out.println("wrong!! ");
            }
            if (choice == 1) {
                System.out.println(" Category    . Brand  .Title  .Price");
                inventory.getInventoryInfo();
            }
            if (choice == 2) {

            }
            if (choice > 3) {
                System.out.println("Choose a valid number [1-3] ");
            }
            if (choice == 3) {
                System.out.println(" Good Bye!..  ");
                continueToRun = false;

            }

        }
    }
}
