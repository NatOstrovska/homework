package com.ua.homework3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstVar = scanner.nextInt();
        int secondVar = scanner.nextInt();
        System.out.println("addition (firstVar + secondVar):" + (firstVar + secondVar));
        System.out.println("subtraction (firstVar - secondVar):" + (firstVar - secondVar));
        System.out.println("division (firstVar / secondVar):" + (firstVar / secondVar));
        System.out.println("multiplication (firstVar * secondVar):" + (firstVar * secondVar));
    }
}
