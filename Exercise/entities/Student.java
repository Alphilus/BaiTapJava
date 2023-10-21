package com.company.entities;

public class Student {
    private static int autoId;
    private int id;
    private String name;
    private int age;
    private String classify;

    public Student(String name, int age, String classify) {
        this.id = ++autoId;
        this.name = name;
        this.age = age;
        this.classify = classify;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classify='" + classify + '\'' +
                '}';
    }
}
