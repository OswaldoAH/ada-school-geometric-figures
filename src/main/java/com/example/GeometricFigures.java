package com.example;

public abstract class GeometricFigures {
    protected double value1;

    public GeometricFigures(double value) {
        this.value1 = value;
    }

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value) {
        this.value1 = value;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
