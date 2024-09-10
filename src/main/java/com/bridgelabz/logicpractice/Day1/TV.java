package com.bridgelabz.logicpractice.Day1;

public class TV {
    private String brand;
    private int size;
    private double price;

    public TV(String brand, int size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    public double calculateDiscountedPrice() {
        double discount = 0;
        if (size >= 50) {
            discount = 0.15; // 15% discount
        } else if (size >= 40) {
            discount = 0.10;
        } else if (size >= 30) {
            discount = 0.05; //
        }

        // return discounted price
        return price * (1 - discount);
    }

    public void printTVDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size + " inches");
        System.out.println("Discounted Price: $" + calculateDiscountedPrice());
    }

    public static void main(String[] args) {
        TV tv1 = new TV("Samsung", 55, 800.00);
        TV tv2 = new TV("LG", 42, 600.00);
        tv1.printTVDetails();
        tv2.printTVDetails();
    }
}
