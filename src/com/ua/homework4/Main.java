package com.ua.homework4;

public class Main {
    public static void main(String[] args) {
        String stringVar = "RobotDreams";
        System.out.println(stringVar.toUpperCase());
        System.out.println(stringVar.toLowerCase());
        System.out.println(stringVar.charAt(0));
        System.out.println(stringVar.charAt(stringVar.length() - 1));

        System.out.println(fib(6));
    }
    static int fib(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return (fib(n - 1) + fib(n-2));
        }
    }

}


