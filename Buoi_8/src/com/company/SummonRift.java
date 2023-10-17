package com.company;

public class SummonRift {

    public SummonRift() {
    }

    @Override
    public String toString() {
        return "SummonRift{}";
    }
}

class SKT extends SummonRift{
    private String name;
    private String position;

    public SKT(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "SKT{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}

class G2 extends SummonRift{
    private String name;
    private String position;

    public G2(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "G2{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
