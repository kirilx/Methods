package org.example;

public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "Unknown";
        this.age = 0;

    }

    public Person(String name , int age) {
        this.name = name;
        this.age = age;
    }
    public void  printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static  String ageCategory(int age){
        if (age < 0) {
            return "Invalid Age";
        } else if (age < 18) {
            return "Child";
        } else if (age < 65) {
            return "Adult";
        } else {
            return "Senior";
        }
    }
}
