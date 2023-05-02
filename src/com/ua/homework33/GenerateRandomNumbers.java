package com.ua.homework33;

import java.util.Random;

public class GenerateRandomNumbers implements Runnable {

    @Override
    public void run() {

       int randomNumber = (int) (Math.random() * 10) + 1;

        try {
            if (randomNumber == 5) {
                Thread.currentThread().interrupt();
                System.out.println("Random number is " + randomNumber + ". Thread was interrupted");

            } else {
                Thread.sleep(300);
                new Thread(new GenerateRandomNumbers()).start();
                System.out.println(randomNumber);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
