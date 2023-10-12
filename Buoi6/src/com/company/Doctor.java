package com.company;

public class Doctor extends Person{
    public String special;
    protected int workHours;

    public Doctor(int doctorId, String doctorName, String special, int workHours) {
        super(doctorId, doctorName, special, workHours);
        this.special = special;
        this.workHours = workHours;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "special='" + special + '\'' +
                ", workHours=" + workHours +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }
}
