package com.company;

public class Person {
    private int patientId;
    private int doctorId;
    protected String doctorName;
    protected String patientName;

    public Person(int record, int day, String patientName, int patientId) {
        this.patientId = patientId;
        this.patientName = patientName;

    }

    public Person(int doctorId, String doctorName, String special, int workHours) {
        this.doctorName = doctorName;
        this.doctorId = doctorId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
}
