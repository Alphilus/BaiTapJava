package com.company;

public class Patient extends Person{
    protected int record;
    public int day;


    public Patient(int record, int day, String patientName, int patientId) {
        super(record, day, patientName, patientId);
        this.record = record;
        this.day = day;
    }

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "record=" + record +
                ", day=" + day +
                ", patientName='" + patientName + '\'' +
                '}';
    }
}
