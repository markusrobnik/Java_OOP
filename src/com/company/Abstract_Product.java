/*
Example of Object Oriented Programming (OOP) in Java
Author: Markus Robnik
Date: 14.04.21
 */
package com.company;

// *** Abstraction using Abstract implementation ***
abstract class Abstract_Product implements Interface_Calculation {

    private int articleNumber;
    private String brand;
    private String description;

    // Getter-Methods
    public int getArticleNumber() {
        return articleNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    // Setter-Methods
    public void setArticleNumber(int articleNumber) {
        this.articleNumber = articleNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}