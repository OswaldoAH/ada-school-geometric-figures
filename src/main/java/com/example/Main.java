package com.example;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        Cube cube = new Cube(3);
        System.out.println(square.getArea());
        System.out.println(cube.getArea());
    }
}