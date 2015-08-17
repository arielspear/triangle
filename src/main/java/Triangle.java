import java.util.Arrays;

public class Triangle{
  private int mSideA;
  private int mSideB;
  private int mSideC;

  public Triangle(int sideA, int sideB, int sideC) {
    int sidesArray[] = {sideA, sideB, sideC};
    Arrays.sort(sidesArray);
    mSideA = sidesArray[0];
    mSideB = sidesArray[1];
    mSideC = sidesArray[2];
    }

  public boolean isTriangle(){
    if ((mSideA + mSideB) > mSideC) {
      return true;
    } else {
      return false;
    }
  }
}
