package com.shapes;

public class RectangleAreaPerimeter {
    double length;
    double breadth;

    public RectangleAreaPerimeter(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
}
