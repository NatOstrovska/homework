package com.ua.homework22;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Ostrovska", 10));
        students.add(new Student("Davalos", 15));
        students.add(new Student("Melnyk", 8));
        students.add(new Student("Gil", 9));

        System.out.println(students);

        Collections.sort(students, (o1, o2) ->  o1.getSurname().compareTo(o2.getSurname()));
        System.out.println(students);
        Collections.sort(students, Comparator.comparingInt(Student::getAverageScore));

        System.out.println(students);

    }
}
