import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
   @Test
   void areaWhenInputsAreIntegers() {
      assertEquals(18, Rectangle.findArea(3,6));
   }

   @Test
   void areaWhenInputsAreDoubles() {
      assertEquals(22.75, Rectangle.findArea(3.5,6.5));
   }

   @Test
   void areaWhenInputsAreIntegerAndDouble() {
      assertEquals(19.5, Rectangle.findArea(3,6.5));
   }

   @Test
   void areaWhenInputsAreDoubleAndInteger() {
      assertEquals(24.5, Rectangle.findArea(3.5,7));
   }

}