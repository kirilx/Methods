package org.example;

public class Circle {
    private double readius;

    public Circle (){
        this.readius =0 ;

    }
    public Circle (double radius){
        this.readius = radius;

    }public double calculateArea () {
        return Math.PI * readius * readius;
    }
public  double calculateParameter () {
        return 2 * Math.PI  * readius ;
}
}
