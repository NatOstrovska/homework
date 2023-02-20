package com.ua.homework10;

import java.util.Arrays;

public class Teacher {
    private String name;
    private String surname;
    private int workExperience;
    private String qualification;
    private String rating;
    private int numCourses = 1;
    private int index = 0;

    private String[] courses;


    public Teacher(String name, String surname, int workExperience, String qualification, String rating, int numCourses) {
        this.name = name;
        this.surname = surname;
        this.workExperience = workExperience;
        this.qualification = qualification;
        this.rating = rating;
        if (numCourses > 0) this.numCourses = numCourses;
        this.courses = new String[numCourses];
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

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void addCourses(String course) {
        courses[index] = course;
        index++;
    }

    public void removeCourse(String course) {
        String[] newCourses = Arrays.copyOf(courses, courses.length);
        int j = 0;
        this.courses = new String[numCourses];
        for (int i = 0; i < newCourses.length; i++) {
            if (!course.equals(newCourses[i])) {
                courses[j] = newCourses[i];
                j++;
            }
        }
        index = j;
    }

    public void printCourses() {
        for (int i = 0; i < index ; i++) {
            System.out.print(this.courses[i] + " ");
        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", workExperience=" + workExperience +
                ", qualification='" + qualification + '\'' +
                ", rating='" + rating + '\'' +
                ", numCourses=" + numCourses +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }
}
