package com.example;

public class Rectangle extends GeometricFigures {
    private double value2;

    public Rectangle(double value1, double value2) {
        super(value1);
        this.value2 = value2;
    }

    @Override
    public double getArea() {
        return this.value1 * this.value2;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.value1 + 2 * this.value2;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

}
