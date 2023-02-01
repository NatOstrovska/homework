package com.ua.homework6;

public class Main {
    public static void main(String[] args) {

        // Task 1
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Task 2
        int j = 1;
        while (j <= 100) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
            j++;
        }
        System.out.println();

        // Task 3
        int factorial = 1;
        int num = 7;
        for (int i = 1; i <= num; i++) {
            factorial *=i;
        }
        System.out.println(factorial);

        // Task 4
        int f1 = 1;
        int f2 = 1;
        int f;
        System.out.print(f1 + " ");
        System.out.print(f2 + " ");
        do {
            f = f1 + f2;
            System.out.print(f + " ");
            f1 = f2;
            f2 = f;
        } while ((f1 + f2) <= 100);
    }
}
