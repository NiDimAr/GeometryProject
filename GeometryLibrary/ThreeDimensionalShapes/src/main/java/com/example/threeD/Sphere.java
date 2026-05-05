package com.example.threeD;

public class Sphere implements ThreeDFigure {

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
    @Override
    public ThreeDFigure scale(double factor) {
        return new Sphere(radius * factor);
    }
}
