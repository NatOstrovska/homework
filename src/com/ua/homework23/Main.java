package com.ua.homework23;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Task 1

        ArrayList<String> surnameList = new ArrayList<>();

        String[] surnames = {"Petrov", "Sydorov", "Sydorov", "Vats", "Ivanov", "Sydorov", "Vats", "Ivanov", "Smirnov", "Vats", "Smirnov", "Gil", "Vats", "Gil", "Gil", "Sydorov", "Ivanov", "Smirnov", "Smirnov", "Vats"};

        for (int i = 0; i < surnames.length; i++) {
            surnameList.add(surnames[i]);
        }

        Map<String, Integer> surnameMap = surnameList.stream()
                .collect(Collectors.toMap(s -> s, s -> 1, Integer::sum));
        System.out.println(surnameMap);


        // Task 2
        ArrayList<Integer> randomNumbersList = new ArrayList<>();

        int count = 10;

        Random random = new Random();

        for (int i = 0; i < count; i++) {
            randomNumbersList.add(random.nextInt(15));
        }

        int sum = randomNumbersList.stream().mapToInt(Integer::intValue).sum();

        System.out.println(randomNumbersList);
        System.out.println(sum);

    }
}
