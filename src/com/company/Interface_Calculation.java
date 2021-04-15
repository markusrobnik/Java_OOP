/*
Example of Object Oriented Programming (OOP) in Java
Author: Markus Robnik
Date: 14.04.21
 */
package com.company;

// *** Abstraction using Interface implementation ***
interface Interface_Calculation {

    double getTax();

    double getDeliveryCost();

    double getDiscount();

    double getPrice();

    void setDeliveryCost(double deliveryCost);

    void setPrice(double price);

    void setDiscount(double discount);
}