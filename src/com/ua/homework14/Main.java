package com.ua.homework14;

public class Main {
    public static void main(String[] args) {
        Person student = new Student("Nataliia", "Ost", "AC123456", "Java", 4, 12, "Abstraction classes");
        Person teacher = new Teacher("Nat", "Ost", 6, "Java", "rating 5");

        print(student);
        print(teacher);

    }

    public static void print(Person person) {
        System.out.println(person.description());
    }

}
