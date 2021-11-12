package com.shapes.test;

import com.shapes.GeometricalShapes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeometricalShapesTest {

   @Test
   void areaOfRectangle() {

      GeometricalShapes rectangle = new GeometricalShapes(3,6);

      assertEquals(18, rectangle.areaOfRectangle());
   }

   @Test
   void perimeterOfRectangle() {
      GeometricalShapes rectangle = new GeometricalShapes(5,5);

      assertEquals(20, rectangle.perimeterOfRectangle());
   }

   @Test
   void areaOfSquare() {

      GeometricalShapes square = new GeometricalShapes(3);

      assertEquals(9, square.areaOfSquare());
   }

   @Test
   void perimeterOfSquare() {

      GeometricalShapes square = new GeometricalShapes(3);

      assertEquals(12, square.perimeterOfSquare());
   }
}