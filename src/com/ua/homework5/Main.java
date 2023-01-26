package com.ua.homework5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //  Program 1
        int number1 = 10;
        int number2 = -10;
        if (number1 > number2) {
            System.out.println("number " + number1 + " is greater than " + number2);
        } else {
            System.out.println("number " + number1 + " is equal or less than " + number2);
        }

        //  Program 2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number:");
        int secondNumber = scanner.nextInt();
        if ( firstNumber < secondNumber) {
            System.out.println("number " + firstNumber + " is less than " + secondNumber);
        } else {
            System.out.println("number " + firstNumber + " is equal or greater than " + secondNumber);
        }

        //  Program 3
        int number = 0;
        if (number % 2 == 0) {
            System.out.println("number " + number + " is even");
        } else {
            System.out.println("number " + number + " is odd");
        }

    }
}


