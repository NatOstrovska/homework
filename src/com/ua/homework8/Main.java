package com.ua.homework8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int arr[] = new int[10];

        fillRandomArray(arr);  // Task 1
        printArray(arr);  // Task 2
        System.out.println();
        System.out.println("min value is " + getMinArraysValue(arr));  // Task 3
        System.out.println("max value is " + getMaxArraysValue(arr));  // Task 4
        System.out.println("average value is " + getAverageArraysValue(arr));  // Task 5
        System.out.println("sum of elements is " + getSumArraysValue(arr));  // Task 6
    }

    // Task 1
    static int[] fillRandomArray (int arr[]) {

        if (arr == null) return null;

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(15);
        }
        return arr;
    }

    // Task 2
    static void printArray(int arr[]) {

        if (isEmptyNullArray(arr)) return;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Task 3
    static int getMinArraysValue(int arr[]) {

        int minValue;

        isEmptyNullArray(arr);

        minValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    // Task 4
    static int getMaxArraysValue(int arr[]) {

        int maxValue;

        isEmptyNullArray(arr);

        maxValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    // Task 5
    static double getAverageArraysValue(int arr[]) {

        double average = 0;

        if (isEmptyNullArray(arr)) return -1;

        for (int i = 0; i < arr.length; i++) {
           average += arr[i];
        }
        average /= 10;

        return average;
    }

    // Task 6
    static int getSumArraysValue(int arr[]) {

        int sum = 0;

        if (isEmptyNullArray(arr)) return -1;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    static boolean isEmptyNullArray (int arr[]) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null");
            return true;
        }
        return false;
    }
}

