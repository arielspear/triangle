import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test void newTriangle_instanciatesCorrectly(){
    Triangle testTriangle = new Triangle (3, 3, 3);
    assertEquals(true, testTriangle instanceof Triangle);
  }
}