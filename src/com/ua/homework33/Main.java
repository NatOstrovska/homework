package com.ua.homework33;

public class Main {

    public static void main(String[] args) {

        Thread RandomThread = new Thread(new GenerateRandomNumbers());

        RandomThread.start();
    }
}
