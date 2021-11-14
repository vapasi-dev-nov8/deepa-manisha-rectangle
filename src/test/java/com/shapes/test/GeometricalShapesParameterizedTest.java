package com.shapes.test;

import com.shapes.GeometricalShapes;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeometricalShapesParameterizedTest {

    @ParameterizedTest
    @MethodSource("valuesToTestAreaOfRectangle")
    void testForAreaOfRectangle(double length, double breadth, double expectedArea){
        GeometricalShapes rectangle = new GeometricalShapes(length, breadth);
        assertEquals(expectedArea,rectangle.areaOfRectangle());
    }

    public static Stream<Arguments> valuesToTestAreaOfRectangle() {
        return Stream.of(
                Arguments.of(3,6,18),
                Arguments.of(3.5,6.5,22.75),
                Arguments.of(-3.5,6.5,-3.5),
                Arguments.of(3.5,-6.5,-6.5),
                Arguments.of(0,0,0),
                Arguments.of(3,0,0),
                Arguments.of(-3,0,-3),
                Arguments.of(-8,-8,-8)
        );
    }

    @ParameterizedTest
    @MethodSource("valuesToTestPerimeterOfRectangle")
    void testForPerimeterOfRectangle(double length, double breadth, double expectedPerimeter){
        GeometricalShapes rectangle = new GeometricalShapes(length, breadth);
        assertEquals(expectedPerimeter,rectangle.perimeterOfRectangle());
    }

    public static Stream<Arguments> valuesToTestPerimeterOfRectangle() {
        return Stream.of(
                Arguments.of(3,6,18),
                Arguments.of(3.5,6.5,20),
                Arguments.of(-3.5,6.5,-3.5),
                Arguments.of(3.5,-6.5,-6.5),
                Arguments.of(0,0,0),
                Arguments.of(3,0,0),
                Arguments.of(-3,0,-3),
                Arguments.of(-8,-8,-8)
        );
    }


    @ParameterizedTest
    @MethodSource("valuesToTestAreaOfSquare")
    void testForAreaOfSquare(double length,double expectedArea){
        GeometricalShapes square = new GeometricalShapes(length);
        assertEquals(expectedArea,square.areaOfSquare());
    }

    public static Stream<Arguments> valuesToTestAreaOfSquare() {
        return Stream.of(
                Arguments.of(4,16),
                Arguments.of(-8,-8),
                Arguments.of(0,0)
        );
    }

    @ParameterizedTest
    @MethodSource("valuesToTestPerimeterOfSquare")
    void testForPerimeterOfSquare(double length,double expectedPerimeter){
        GeometricalShapes square = new GeometricalShapes(length);
        assertEquals(expectedPerimeter,square.perimeterOfSquare());
    }

    public static Stream<Arguments> valuesToTestPerimeterOfSquare() {
        return Stream.of(
                Arguments.of(5,20),
                Arguments.of(-8,-8),
                Arguments.of(0,0)
        );
    }


}
