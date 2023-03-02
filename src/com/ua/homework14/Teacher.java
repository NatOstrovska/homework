package com.ua.homework14;

public class Teacher extends Person {

    private int workExperience;
    private String qualification;
    private String rating;

    public Teacher(String name, String surname, int workExperience, String qualification, String rating) {
        super(name, surname);
        this.workExperience = workExperience;
        this.qualification = qualification;
        this.rating = rating;
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

    @Override
    public String description() {
        return (name + ", " + surname + ", " + workExperience + ", " + qualification + ", " + rating + ", ");
    }
}
