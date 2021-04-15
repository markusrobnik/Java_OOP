/*
Example of Object Oriented Programming (OOP) in Java
Author: Markus Robnik
Date: 14.04.21
 */
package com.company;

// *** Abstraction using Abstract implementation ***
abstract class Abstract_Footwear extends Abstract_Product {

    private char gender;
    private String size;
    private String color;

    // Getter-Methods
    public char getGender() {
        return gender;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    // Setter-Methods
    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }
}