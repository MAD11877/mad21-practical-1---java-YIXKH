import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    int rows, i, j;
    Scanner in = new Scanner(System.in);
    System.out.println();
    rows = in.nextInt();
    for(i = rows; i > 0; i--) 
    {
      for(j = i; j > 0; j--) 
      {
        System.out.print("*");
      }
      System.out.print("\n");
    }   
    in.close();
  }
}
