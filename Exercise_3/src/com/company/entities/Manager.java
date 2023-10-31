package com.company.entities;

public class Manager extends OfficeEmployee{
    private double responseSalary;

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public Manager(String name, double salary, double responseSalary) {
        super(name, salary);
        this.responseSalary = responseSalary;
    }

    public double getResponseSalary() {
        return responseSalary;
    }

    public void setResponseSalary(double responseSalary) {
        this.responseSalary = responseSalary;
    }

    @Override
    public String toString() {
        return "Manager{" + "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", responseSalary=" + responseSalary +
                '}';
    }
}
