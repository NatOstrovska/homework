package com.ua.homework14;

public class Student extends Person {

    private String id;
    private String course;
    private int group;
    private int progress;
    private String lesson;

    public Student(String name, String surname, String id, String course, int group, int progress, String lesson) {
        super(name, surname);
        this.id = id;
        this.course = course;
        this.group = group;
        this.progress = progress;
        this.lesson = lesson;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String description() {
        return (name + ", " + surname + ", " + id + ", " + course + ", " + group + ", " + progress + ", " + lesson);
    }
}
