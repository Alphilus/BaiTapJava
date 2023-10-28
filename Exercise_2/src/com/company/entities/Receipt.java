package com.company.entities;

public class Receipt {
    private long oldNumber;
    private long newNumber;
    private double electricBill;
    private Customer customer;

    public Receipt(long oldNumber, long newNumber, double electricBill, Customer customer) {
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
        this.electricBill = electricBill;
        this.customer = customer;
    }

    public long getOldNumber() {
        return oldNumber;
    }

    public void setOldNumber(long oldNumber) {
        this.oldNumber = oldNumber;
    }

    public long getNewNumber() {
        return newNumber;
    }

    public void setNewNumber(long newNumber) {
        this.newNumber = newNumber;
    }

    public double getElectricBill() {
        return electricBill;
    }

    public void setElectricBill(double electricBill) {
        this.electricBill = electricBill;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "oldNumber=" + oldNumber +
                ", newNumber=" + newNumber +
                ", electricBill=" + electricBill +
                ", customer=" + customer +
                '}';
    }
}
