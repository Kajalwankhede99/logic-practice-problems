package com.bridgelabz.logicpractice.Day1;

public class Phone {
    private String make;
    private String model;
    private int storage;

    public Phone(String make, String model, int storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    public double calculatePrice() {
        double basePrice = 0;
        if (make.equals("Apple")) {
            if (model.equals("iPhone 14")) {
                basePrice = 799;
            } else if (model.equals("iPhone 14 Pro")) {
                basePrice = 999;
            }
        } else if (make.equals("Samsung")) {
            if (model.equals("Galaxy S23")) {
                basePrice = 699;
            } else if (model.equals("Galaxy S23 Ultra")) {
                basePrice = 1099;
            }
        }
        // price based on storage
        double storageCost = storage * 1.5;
        return basePrice + storageCost;
    }
    public void printPhoneDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Price: $" + calculatePrice());
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("Apple", "iPhone 14", 128);
        Phone phone2 = new Phone("Samsung", "Galaxy S23 Ultra", 256);
        phone1.printPhoneDetails();
        phone2.printPhoneDetails();
    }
}
