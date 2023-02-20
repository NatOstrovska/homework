package com.ua.homework10;

import java.util.Arrays;

public class Student {

    private String id;
    private String name;
    private String surname;

    private int[] grades;
    private String[] courses;

    private int index = 0;
    private int numCourses = 1;

        public Student(String id, String name, String surname, int numCourses) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            if(numCourses > 0)  this.numCourses = numCourses;
            this.courses = new String[this.numCourses];
            this.grades = new int[this.numCourses];
        }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }

    public void addCourses(String course, int grade){
           courses [index] = course;
           grades [index] = grade;
           index++;
    }
    public void printCourses(){
        for (int i = 0; i <= index-1; i++) {
            System.out.print(getCourses()[i] + " ");
            System.out.print(getGrades()[i] + " ");

        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grades=" + Arrays.toString(grades) +
                ", courses=" + Arrays.toString(courses) +
                ", index=" + index +
                ", numCourses=" + numCourses +
                '}';
    }
}
