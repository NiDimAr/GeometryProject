package com.example.threeD;

public class Cube implements ThreeDFigure {

    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double volume() {
        return side * side * side;
    }

    public double surfaceArea() {
        return 6 * side * side;
    }
    @Override
    public ThreeDFigure scale(double factor) {
        return new Cube(side * factor);
    }
}
