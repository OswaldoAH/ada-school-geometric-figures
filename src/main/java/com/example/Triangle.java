package com.example;

public class Triangle extends GeometricFigures {
    private double value2;

    public Triangle(double value1, double value2) {
        super(value1);
        this.value2 = value2;
    }

    @Override
    public double getArea() {
        return (this.value1 * this.value2) / 2;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.value1 + this.value2;
    }

}
