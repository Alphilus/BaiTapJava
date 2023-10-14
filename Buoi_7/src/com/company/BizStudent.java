package com.company;

public class BizStudent extends TechMasterStudents{
    private double marketing;
    private double sales;

    public BizStudent(String name, String major, double marketing, double sales) {
        super(name, major);
        this.marketing = marketing;
        this.sales = sales;
    }

    @Override
    public double getScore() {
        return (2*marketing+sales)/3;
    }
}
