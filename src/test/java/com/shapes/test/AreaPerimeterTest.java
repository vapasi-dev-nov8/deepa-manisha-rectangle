package com.shapes.test;

import com.shapes.AreaPerimeter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaPerimeterTest {

   @Test
   void areaOfRectangle() {

      AreaPerimeter rectangle = new AreaPerimeter(3,6);

      assertEquals(18, rectangle.areaOfRectangle());
   }

   @Test
   void perimeterOfRectangle() {
      AreaPerimeter rectangle = new AreaPerimeter(5,5);

      assertEquals(20, rectangle.perimeterOfRectangle());
   }

   @Test
   void areaOfSquare() {

      AreaPerimeter square = new AreaPerimeter(3);

      assertEquals(9, square.areaOfSquare());
   }

   @Test
   void perimeterOfSquare() {

      AreaPerimeter square = new AreaPerimeter(3);

      assertEquals(12, square.perimeterOfSquare());
   }

}