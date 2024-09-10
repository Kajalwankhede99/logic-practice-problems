package com.bridgelabz.logicpractice.Day1;

public class Dog {
    private String breed;
    private int age;
    private double weight;

    public Dog(String breed, int age, double weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public int calculateHumanYears() {
        return age * 7; // 1 dog year = 7 human years
    }

    public void printDogDetails() {
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age + " dog years (" + calculateHumanYears() + " human years)");
        System.out.println("Weight: " + weight + " kg");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Golden Retriever", 5, 30.0);
        Dog dog2 = new Dog("Beagle", 3, 12.5);
        dog1.printDogDetails();
        dog2.printDogDetails();
    }
}
