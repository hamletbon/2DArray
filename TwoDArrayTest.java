
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
       int[][] a2dArray = new int[200][100]; 
      int counter = 1;
      for (int r = 0; r < a2dArray.length; r++)
      {
          for (int c = 0; c < a2dArray[r].length; c++)
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
