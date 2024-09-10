package com.bridgelabz.logicpractice.Day2;

import java.util.Scanner;

public class NumberCheck {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an number: ");
        int number=scanner.nextInt();
        if (number<0){
            System.out.println("Number is negative: " +number);
        }
          else if (number>0){
            System.out.println("Number is positive: " +number);
        }
        else {
            System.out.println("Number is zero: " +number);
        }
    }

}
