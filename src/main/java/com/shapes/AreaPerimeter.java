package com.shapes;

import sun.security.util.Length;

public class AreaPerimeter {
    double length;
    double breadth;

    public AreaPerimeter(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public AreaPerimeter(double length) {
        this.length = length;
    }

    public double areaOfRectangle() {
        return length * breadth;
    }

    public double areaOfSquare() {
        return length * length;
    }

    public double perimeterOfSquare() {
        return length * 4;
    }

    public double perimeterOfRectangle() {
        return 2 * (length + breadth);
    }
}
