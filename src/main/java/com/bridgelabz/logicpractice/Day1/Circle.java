package com.bridgelabz.logicpractice.Day1;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {

        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {

        return 2 * Math.PI * radius;
    }

    public void printCircleDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area Of Circle: " + calculateArea());
        System.out.println("Circumference of the circle: " + calculateCircumference());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.printCircleDetails();
    }
}
