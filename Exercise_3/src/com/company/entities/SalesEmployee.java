package com.company.entities;

public class SalesEmployee extends OfficeEmployee{
    private double salesBonus;
    private double percentBonus;

    public SalesEmployee(String name, double salary, double salesBonus, double percentBonus) {
        super(name, salary);
        this.salesBonus = salesBonus;
        this.percentBonus = percentBonus;
    }

    public double getSalesBonus() {
        return salesBonus;
    }

    public void setSalesBonus(double salesBonus) {
        this.salesBonus = salesBonus;
    }

    public double getPercentBonus() {
        return percentBonus;
    }

    public void setPercentBonus(double percentBonus) {
        this.percentBonus = percentBonus;
    }

    @Override
    public String toString() {
        return "SalesEmployee{" + "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", salesBonus=" + salesBonus +
                ", percentBonus=" + percentBonus +
                '}';
    }
}
