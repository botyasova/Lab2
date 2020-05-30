package com.company;

import static java.lang.Math.abs;

public class Rectangle {
    // Create a class attributes
    private float upperLeftX; // Upper left vertex X-coordinate
    private float upperLeftY; // Upper left vertex Y-coordinate
    private float lowerRightX; // Lower right vertex X-coordinate
    private float lowerRightY; // Lower right vertex Y-coordinate

    // Create a class constructor for the Rectangle class
    public Rectangle(float upperLeftX, float upperLeftY, float lowerRightX, float lowerRightY) {
        this.upperLeftX = upperLeftX;
        this.upperLeftY = upperLeftY;
        this.lowerRightX = lowerRightX;
        this.lowerRightY = lowerRightY;
    }
     // Area calculation method
    public void calculateArea() {
    float area = Math.abs(lowerRightX - upperLeftX) * Math.abs(lowerRightY - upperLeftY);
    System.out.println("Area = " + area);
    }

    // Perimeter calculation method
    public void calculatePerimeter() {
        float perimeter = (Math.abs(lowerRightX - upperLeftX) + Math.abs(lowerRightY - upperLeftY)) * 2;
        System.out.println("Perimeter = " + perimeter);
    }
}
