package com.company.entities;

import java.util.ArrayList;

public class ClassRoom {
    private String subject;
    private ArrayList<Student> students;

    public ClassRoom(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "subject='" + subject + '\'' +
                ", students=" + students +
                '}';
    }
}
