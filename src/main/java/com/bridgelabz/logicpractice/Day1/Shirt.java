package com.bridgelabz.logicpractice.Day1;


public class Shirt {
    private String size;
    private String color;
    private double price;


    public Shirt(String size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public double getDiscountedPrice() {
        double discount = 0;
        if (size.equals("S")) {
            discount = 0.05; // 5% discount for Small
        } else if (size.equals("M")) {
            discount = 0.10; // 10% discount for Medium
        } else if (size.equals("L")) {
            discount = 0.15; // 15% discount for Large
        }

        return price * (1 - discount);
    }
    public void printShirtDetails() {
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Discounted Price: $" + getDiscountedPrice());
    }

    public static void main(String[] args) {
        Shirt shirt1 = new Shirt("S", "Red", 50.00);
        Shirt shirt2 = new Shirt("L", "Blue", 60.00);
        shirt1.printShirtDetails();
        shirt2.printShirtDetails();
    }
}
