package com.company;

public class ITStudent extends TechMasterStudents {
    private final double html;
    private final double css;
    private final double java;

    public ITStudent(String name, String major, double html, double css, double java) {
        super(name, major);
        this.html = html;
        this.css = css;
        this.java = java;
    }

    @Override
    public double getScore() {
        return (2*java+html+css)/4;
    }
}
