package com.example.app;

import com.example.core.Circle;
import com.example.core.GeometricFigure;
import com.example.core.Triangle;
import com.example.core.Rectangle;
import com.example.threeD.Cube;
import com.example.threeD.Sphere;
import com.example.threeD.ThreeDFigure;
import com.example.utils.FigureUtils;

public class Main {
    public static void main(String[] args) {

        GeometricFigure circle = new Circle(5);
        GeometricFigure rectangle = new Rectangle(10, 20);
        GeometricFigure triangle = new Triangle(3, 4, 5);
        System.out.println("Circle:");
        System.out.println("Area = " + circle.area());
        System.out.println("Perimeter = " + circle.perimeter());
        System.out.println("\nRectangle:");
        System.out.println("Area = " + rectangle.area());
        System.out.println("Perimeter = " + rectangle.perimeter());
        System.out.println("\nTriangle:");
        System.out.println("Area = " + triangle.area());
        System.out.println("Perimeter = " + triangle.perimeter());
        double circleArea = circle.area();
        double rectArea = rectangle.area();
        double areaDiff = FigureUtils.compareArea(circle, rectangle);
        double perimeterDiff = FigureUtils.comparePerimeter(rectangle, triangle);


        ThreeDFigure cube = new Cube(3);
        ThreeDFigure sphere = new Sphere(4);
        double cubeVolume = cube.volume();
        double sphereSurface = sphere.surfaceArea();
        ThreeDFigure scaledCube = cube.scale(2);
        ThreeDFigure scaledSphere = sphere.scale(0.5);
        double scaledCubeVolume = scaledCube.volume();
        double scaledSphereVolume = scaledSphere.volume();
        ThreeDFigure bigCube = new Cube(5).scale(3);
        double bigVolume = bigCube.volume();
    }
}