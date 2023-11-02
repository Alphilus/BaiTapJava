package com.company.entities;

public class Student {
    private static int autoid;
    private int id;
    private String name;
    private double score;

    public Student(String name, double score) {
        this.id = autoid++;
        this.name = name;
        this.score = score;
    }

    public static int getAutoid() {
        return autoid;
    }

    public static void setAutoid(int autoid) {
        Student.autoid = autoid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
