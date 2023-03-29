package com.ua.homework22;

import java.util.Comparator;

public class Student {

    private String surname;
    private int averageScore;

    public Student(String surname, int averageScore) {
        this.surname = surname;
        this.averageScore = averageScore;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return surname +":"+ averageScore;
    }
}
