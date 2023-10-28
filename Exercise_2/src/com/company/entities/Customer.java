package com.company.entities;

public class Customer {
    private String nameOwner;
    private int houseID;
    private String valueCode;

    public Customer(String nameOwner, int houseID, String valueCode) {
        this.nameOwner = nameOwner;
        this.houseID = houseID;
        this.valueCode = valueCode;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public int getHouseID() {
        return houseID;
    }

    public void setHouseID(int houseID) {
        this.houseID = houseID;
    }

    public String getValueCode() {
        return valueCode;
    }

    public void setValueCode(String valueCode) {
        this.valueCode = valueCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nameOwner='" + nameOwner + '\'' +
                ", houseID=" + houseID +
                ", valueCode=" + valueCode +
                '}';
    }
}
