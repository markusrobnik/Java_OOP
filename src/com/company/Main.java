/*
Example of Object Oriented Programming (OOP) in Java
Author: Markus Robnik
Date: 14.04.21
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        Boots newBoot = new Boots();

        newBoot.setArticleNumber(182772);
        newBoot.setBrand("Adidas");
        newBoot.setDescription("The adidas TERREX AX3R Mid Walking Shoes benefit from a premium Gore Tex waterproof and breathable lining for protection from wet weather plus a Traxion outsole delivers secure grip even on rugged terrain.");
        newBoot.setGender('M');
        newBoot.setSize("10");
        newBoot.setColor("black/blue");

        newBoot.setPrice(29.99);
        newBoot.setDeliveryCost(5.99);
        newBoot.setDiscount(7.99);

        System.out.println("*** Product Information ***");
        System.out.println("Articlenumber: " + newBoot.getArticleNumber());
        System.out.println("Brand: " + newBoot.getBrand());
        System.out.println("Description: " + newBoot.getDescription());
        System.out.println("Gender: " + newBoot.getGender());
        System.out.println("Size: " + newBoot.getSize());
        System.out.println("Color: " + newBoot.getColor());

        System.out.println("\n*** Price calculation ***");
        System.out.println("Tax: " + newBoot.getTax() + "€");
        System.out.println("Delivery cost: " + newBoot.getDeliveryCost() + "€");
        System.out.println("Discount: " + newBoot.getDiscount() + "€");
        System.out.println("Pice: " + newBoot.getPrice() + "€");
        newBoot.calculateTotalPrice();
    }
}