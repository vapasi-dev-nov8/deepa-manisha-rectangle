package com.shapes;

import sun.security.util.Length;

public class GeometricalShapes {
    double length;
    double breadth;

    public GeometricalShapes(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public GeometricalShapes(double length) {
        this.length = length;
    }

    public double areaOfRectangle() {

        if(isNegativeOrZero(length)) {
            return length;
        }

        if(isNegativeOrZero(breadth)) {
            return breadth;
        }
        return length * breadth;
    }

    public double perimeterOfRectangle() {

        if(isNegativeOrZero(length)) {
            return length;
        }

        if(isNegativeOrZero(breadth)) {
            return breadth;
        }
        return 2 * (length + breadth);
    }

    public double areaOfSquare() {

        if(isNegativeOrZero(length)) {
            return length;
        }
        return length * length;
    }

    public double perimeterOfSquare() {

        if(isNegativeOrZero(length)) {
            return length;
        }
        return length * 4;
    }

    private boolean isNegativeOrZero(double value) {
        if(value <=0 ) {
            return true;
        }
        return false;
    }
}
