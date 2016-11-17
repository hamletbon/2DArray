
/**
 * Write a description of class TwoDArrayTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TwoDArrayTest
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class TwoDArrayTest
     */
    public static void main()
    {
       int[][] a2dArray = new int[3][4]; 
       /*
       a2dArray[0][0] = 1;
       a2dArray[0][1] = 2;
       a2dArray[0][2] = 3;
       a2dArray[0][3] = 4;
       a2dArray[1][0] = 5;
       a2dArray[1][1] = 6;
       a2dArray[1][2] = 7;
       a2dArray[1][3] = 8;
       a2dArray[2][0] = 9;
       a2dArray[2][1] = 10;
       a2dArray[2][2] = 11;
       a2dArray[2][3] = 12;
       */
      int counter = 0;
      for (int r = 0; r < 3; r++)
      {
          for (int c = 0; c < 4; c++)
          {
              System.out.println("a2dArray[" + r + "][" + c + "]: "+counter);
              a2dArray[r][c] = counter;
              counter++;
          }
      }
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
