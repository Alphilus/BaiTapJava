package com.company.entities;

public class OfficeEmployee {
    private static int autoId;
    private int id;
    private String name;
    private double salary;

    public OfficeEmployee(String name, double salary) {
        this.id = ++autoId;
        this.name = name;
        this.salary = salary;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        OfficeEmployee.autoId = autoId;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "OfficeEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
