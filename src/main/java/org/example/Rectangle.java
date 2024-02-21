package org.example;

public class Rectangle {
    private double length;
    private double height;

    public Rectangle() {
        this.length = 0;
        this.height = 0;
    }

    public Rectangle (double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double calculateArea() {
        return length * height;
    }
    public double calculatePerimeter() {
        return 2 *(length + height) ;
    }
}
