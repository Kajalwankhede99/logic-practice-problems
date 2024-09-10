package com.bridgelabz.logicpractice.Day2;


abstract class Shape {
    abstract void draw();
    abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}


class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println(" Rectangle with width: " + width + " and height: " + height);
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        circle.draw();
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println();

        rectangle.draw();
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}
