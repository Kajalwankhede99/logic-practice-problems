package com.bridgelabz.logicpractice.Day2;

public class ReverseString {

    public static void main(String[] args) {
            String string = "Kajal wankhede";
            String reversedStr = "";
            for(int i = string.length()-1; i >= 0; i--){
                reversedStr = reversedStr + string.charAt(i);    //Iterate through last and add character to reversedStr

            }

            System.out.println("Original string: " + string);
            System.out.println("Reverse of given string: " + reversedStr);
        }
    }