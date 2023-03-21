package com.ua.homework19;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        Set<Integer> hashSet= new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < 100; i++) {
            hashSet.add(random.nextInt(1, 51));
            linkedHashSet.add(random.nextInt(1, 51));
            treeSet.add(random.nextInt(1, 51));
        }

        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
    }
}
