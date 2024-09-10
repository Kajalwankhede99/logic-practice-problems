package com.bridgelabz.logicpractice.Day1;

public class Employee {

    private String name;
    private double salary;
    private int ID;

      public Employee(String name, double salary, int ID) {
        this.name = name;
        this.salary = salary;
        this.ID = ID;
    }

    public double calculateYearlySalary() {
        return this.salary * 12;
    }

    public void printEmployeeDetails() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Monthly Salary: " + this.salary);
        System.out.println("Employee Yearly Salary: " + calculateYearlySalary());
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Kajal Wankhede", 35000, 11);
        emp.printEmployeeDetails();
    }
}
