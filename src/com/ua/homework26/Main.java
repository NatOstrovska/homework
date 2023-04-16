package com.ua.homework26;

public class Main {
    public static void main(String[] args) {

        try{
            int number = -3;
            int squareNumber = square(number);
            System.out.println("Square of number " + number + " is " + squareNumber);

        } catch (NegativeNumberException e){
            System.out.println(e.getMessage());
        }
    }

    public static int square(int number) throws NegativeNumberException {

        if (number < 0) {
            throw new NegativeNumberException("Error! Number " + number + " is less 0");
        }
        return number * number;
    }
}
