package com.ua.homework10;


public class Main {
    public static void main(String[] args) {

        // Task 1
        Student student = new Student("FX123456", "Nat", "Ostrovska", 2);
        student.addCourses("Math", 8);
        student.addCourses("Java", 9);

        student.printCourses();

        System.out.println();
        System.out.println(student);
        System.out.println();


        Teacher teacher = new Teacher("Nataliia", "Ostrovska", 10, "high", "high", 3);
        teacher.addCourses("Java");
        teacher.addCourses("JavaScript");
        teacher.addCourses("HTML&CSS");
        teacher.printCourses();

        System.out.println();
        System.out.println(teacher.toString());
        System.out.println();

        teacher.removeCourse("Java");
        System.out.println("After Remove");
        teacher.printCourses();
        System.out.println();


        // Task 2
        ArrayNumber arrayNumber = new ArrayNumber(5);
        arrayNumber.print();
        arrayNumber.sort();
        arrayNumber.print();
        arrayNumber.reverse();
        arrayNumber.print();
    }
}
