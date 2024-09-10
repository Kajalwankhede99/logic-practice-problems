package com.bridgelabz.logicpractice.Day1;

public class Furniture {
    private String type;
    private String material;
    private double price;

    public Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    public double getDiscountedPrice() {
        if (material.equals("Wood")) {
            return price * 0.90; // 10% discount
        } else if (material.equals("Metal")) {
            return price * 0.95;
        } else if (material.equals("Plastic")) {
            return price * 0.85;
        } else {
            return price; // No discount
        }
    }

    public void displayDetails() {
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Discounted Price: " + getDiscountedPrice());
    }

    public static void main(String[] args) {
        Furniture chair = new Furniture("Chair", "Wood", 100.00);
        Furniture table = new Furniture("Table", "Metal", 150.00);
        chair.displayDetails();
        table.displayDetails();
    }
}
