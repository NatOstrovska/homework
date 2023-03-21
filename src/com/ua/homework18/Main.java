package com.ua.homework18;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

         List<Integer> integerList = new ArrayList<>();
         List<String> stringList = new LinkedList<>();
         OstrovskaList<Integer> ostrList= new OstrovskaList<>();

         for (int i = 0; i < 10; i++)
            integerList.add(random.nextInt(15));

        System.out.println(integerList);

        int size = 2000000;
        for (int i = 0; i < size; i++) {
            stringList.add("String-" + i);
        }
        System.out.println(stringList);

        Collection<Student> studentLst = new ArrayList<>();
        studentLst.add(new Student("Arturo", "Davalos", "1234"));
        studentLst.add(new Student("Natalia", "Ostrovska", "4444"));
        studentLst.add(new Student("Anetti", "Davalos", "99999"));


        System.out.println(studentLst);

        for (int i = 0; i < 10; i++)
            ostrList.add(random.nextInt(15));

        System.out.println(ostrList);
    }


}

