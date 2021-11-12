package com.shapes.test;

import com.shapes.RectangleAreaPerimeter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleAreaPerimeterTest {
   @Test
   void areaWhenInputsAreIntegers() {
      RectangleAreaPerimeter rectangle = new RectangleAreaPerimeter();

      assertEquals(18, rectangle.findArea(3,6));
   }

   @Test
   void areaWhenInputsAreDoubles() {
      RectangleAreaPerimeter rectangle = new RectangleAreaPerimeter();

      assertEquals(22.75, rectangle.findArea(3.5,6.5));
   }

   @Test
   void areaWhenInputsAreIntegerAndDouble() {
      RectangleAreaPerimeter rectangle = new RectangleAreaPerimeter();

      assertEquals(19.5, rectangle.findArea(3,6.5));
   }

   @Test
   void areaWhenInputsAreDoubleAndInteger() {
      RectangleAreaPerimeter rectangle = new RectangleAreaPerimeter();

      assertEquals(24.5, rectangle.findArea(3.5,7));
   }

}