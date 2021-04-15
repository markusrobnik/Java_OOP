/*
Example of Object Oriented Programming (OOP) in Java
Author: Markus Robnik
Date: 14.04.21
 */
package com.company;

import java.text.NumberFormat;

class Boots extends Abstract_Footwear {

    private final double tax = 20.00;
    private double deliveryCost;
    private double discount;
    private double price;
    private double totalPrice;

    @Override
    public double getTax() {
        return tax;
    }

    @Override
    public double getDeliveryCost() {
        return deliveryCost;
    }

    @Override
    public double getDiscount() {
        return discount;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setDeliveryCost(double deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void calculateTotalPrice() {
        if (price != 0 && deliveryCost != 0 && discount != 0) {
            double taxPrice = price + (price / 100) * tax;
            totalPrice = (taxPrice + deliveryCost) - discount;
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMaximumFractionDigits(2);
            System.out.println("--- Total price: " + nf.format(totalPrice) + "€ ---");
        } else {
            System.out.println("Error, it seems that one of the required values is not available!");
        }
    }
}