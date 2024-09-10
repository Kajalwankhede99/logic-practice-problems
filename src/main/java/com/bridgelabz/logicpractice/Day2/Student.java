package com.bridgelabz.logicpractice.Day2;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int age;
    private List<Integer> grades;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grades = new ArrayList<>();
    }


    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("Invalid grade");
        }
    }


    public double calculateAverageGrade() {
        if (grades.isEmpty())
            return 0.0;
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total / (double) grades.size();
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Average Grade: " + calculateAverageGrade());
    }



    public static void main(String[] args) {
        Student student = new Student("John", 20);
        student.addGrade(85);
        student.addGrade(90);
        student.addGrade(78);
        student.displayInfo();
    }
}

