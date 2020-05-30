package com.company;

public class Main {

    // Entry point
    public static void main(String[] args) {
        System.out.println("Rectangle with coordinates of upper left vertex (6,13) and lower right vertex (9,5):");
        // Create a Rectangle object and pass parameters (coordinates of vertices) to the constructor
        Rectangle r = new Rectangle(6,13,9,5);
        // Call the methods
        r.calculateArea();
        r.calculatePerimeter();

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Rectangle with coordinates of upper left vertex (9,-1) and lower right vertex (29,-11):");
        Rectangle r2 = new Rectangle(9,-1,29,-11);
        r2.calculateArea();
        r2.calculatePerimeter();

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Rectangle with coordinates of upper left vertex (0,1) and lower right vertex (9,-6):");
        Rectangle r3 = new Rectangle(0,1,9,-6);
        r3.calculateArea();
        r3.calculatePerimeter();

        // You can check the answers quickly using this resource: https://www.mathopenref.com/coordrectareaperim.html
    }
}
