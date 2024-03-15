package com.example;

public class Cube extends Square {

    public Cube(double value1) {
        super(value1);
    }

    @Override
    public double getArea() {
        return Math.pow(this.value1, 3);
    }
}
