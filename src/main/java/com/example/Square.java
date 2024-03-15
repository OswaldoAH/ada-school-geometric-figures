package com.example;

public class Square extends GeometricFigures {

    public Square(double value1) {
        super(value1);
    }

    @Override
    public double getArea() {
        return Math.pow(this.value1, 2);
    }

    @Override
    public double getPerimeter() {
        return this.value1*4;
    }

}
