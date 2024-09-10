package com.bridgelabz.logicpractice.Day2;
import java.util.Scanner;

public class AlphabatOrVowel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single alphabet character: ");
        char ch = scanner.next().toLowerCase().charAt(0);
        if (!Character.isLetter(ch)) {
                System.out.println("Invalid input.");
            } else {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println(ch + " is a vowel.");
                } else {
                    System.out.println(ch + " is a consonant.");
                }
            }
        }
}
