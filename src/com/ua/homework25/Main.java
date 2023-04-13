package com.ua.homework25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; ; ) {

            System.out.println("Enter number:");

            try {
                double enteredNumber = scanner.nextDouble();
                System.out.println(enteredNumber);
                break;

            } catch(InputMismatchException e) {
                System.out.println("Please enter number instead of letter");
                scanner.next();

            }
        }
    }
}


