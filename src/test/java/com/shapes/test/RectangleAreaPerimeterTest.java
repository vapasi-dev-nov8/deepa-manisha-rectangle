package com.shapes.test;

import com.shapes.RectangleAreaPerimeter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleAreaPerimeterTest {

   @Test
   void areaOfRectangle() {

      RectangleAreaPerimeter rectangle = new RectangleAreaPerimeter(3,6);

      assertEquals(18, rectangle.area());
   }

   @Test
   void perimeterOfRectangle() {
      RectangleAreaPerimeter rectangle = new RectangleAreaPerimeter(5,5);

      assertEquals(20, rectangle.perimeter());
   }



}