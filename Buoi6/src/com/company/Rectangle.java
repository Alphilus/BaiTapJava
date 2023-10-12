package com.company;

public class Rectangle extends Geometry {
    public int length;
    public int width;

    public Rectangle(int side, int length, int width) {
        super(side);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side=" + side +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
