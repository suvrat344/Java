
import java.util.Scanner;

// Create a program using for loop multiplication table for a number.

public class p19MultiplicationTable 
{
  public static void main(String[] args) 
  {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter number : ");
      int num = input.nextInt();

      for (int i = 1; i <= 10; i++) 
      {
          System.out.println(num + " x " + i + " = " + (num * i));
      }
  }
}
