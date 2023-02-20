package com.ua.homework10;

import java.util.Arrays;
import java.util.Random;

public class ArrayNumber {

    private int [] randomArray;

    public ArrayNumber(int size) {
        Random random = new Random();
        randomArray = new int[size];

        if (size <= 0) System.out.println("error");

        for (int i = 0; i < size; i++) {
            randomArray[i] = random.nextInt(10);
        }
    }

    public void sort() {
        //int[] sortArray = this.randomArray;
        Arrays.sort(randomArray);
    }

    public void reverse() {
        int[] revArray = new int[randomArray.length];
        for (int i = 0, j = revArray.length - 1;
             i < randomArray.length; i++, j--) {
            revArray[j] = randomArray[i];
        }
        randomArray = revArray;
    }

    public void print () {
        System.out.println(Arrays.toString(randomArray));
    }
}


