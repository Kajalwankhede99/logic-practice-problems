package com.bridgelabz.logicpractice.Day2;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        setAge(age);
        setEmail(email); 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            System.out.println("Invalid email address.");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Email: " + getEmail());
    }

    public static void main(String[] args) {
        Person person = new Person("kajal wankhede", 20, "kajal@gmail.com");

        person.displayInfo();
        person.setAge(31);
        person.setEmail("kajalwankhede@gmail.com");
        person.displayInfo();
    }
}

