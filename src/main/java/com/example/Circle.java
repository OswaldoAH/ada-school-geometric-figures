package com.example;

public class Circle extends GeometricFigures {

    public Circle(double value1) {
        super(value1);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.value1, 2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * this.value1;
    }

}
