package com.example.utils;

import com.example.core.GeometricFigure;

public class FigureUtils {

    public static double compareArea(GeometricFigure f1, GeometricFigure f2) {
        return f1.area() - f2.area();
    }

    public static double comparePerimeter(GeometricFigure f1, GeometricFigure f2) {
        return f1.perimeter() - f2.perimeter();
    }
    public static double convertCmToM(double cm) {
        return cm / 100;
    }
}
