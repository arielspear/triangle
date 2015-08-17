import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_instanciatesCorrectly(){
    Triangle testTriangle = new Triangle (3, 3, 3);
    assertEquals(true, testTriangle instanceof Triangle);
  }

  @Test
  public void isTriangle_whenNotTriangle_false(){
    Triangle testTriangle = new Triangle(2, 2, 8);
    assertEquals(false, testTriangle.isTriangle());
  }

  @Test
  public void triangleType_whenEquilateral_equilateral(){
    Triangle testTriangle = new Triangle (3, 3, 3);
    assertEquals("equilateral", testTriangle.triangleType());
  }

  @Test
  public void triangleType_whenIsosceles_isosceles(){
    Triangle testTriangle = new Triangle(2, 4, 2);
    assertEquals("isosceles", testTriangle.triangleType());
  }
  
}
