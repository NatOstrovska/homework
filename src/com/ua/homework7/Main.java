package com.ua.homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number = 5;
        String symbol = "";
        System.out.println(getCubeNumber(number));

        Scanner scannerNum = new Scanner(System.in);
        System.out.print("Enter quantity of symbols: ");
        int quantitySymbols = scannerNum.nextInt();
        Scanner scannerSymbol = new Scanner(System.in);

        do {
            System.out.print("Enter symbol: ");
            symbol = scannerSymbol.next();
        } while(Character.isLetterOrDigit(symbol.charAt(0)));

        if ( symbol.equals("*")) {
            printSymbol(quantitySymbols);
        } else {
            printSymbol(quantitySymbols, symbol);
        }
    }

    // Task 1
    static double getCubeNumber(double num) {
        return Math.pow(num, 3);
    }

    // Task 2
    static void printSymbol(int quantitySymbols) {
        printSymbol(quantitySymbols, "*");
    }

    // Task 3
    static void printSymbol(int quantitySymbols, String symbol) {
        for(int i=0 ; i < quantitySymbols; i++) {
            System.out.print(symbol);
        }
        System.out.println("");
    }
}
