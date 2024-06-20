// Create a program using recursion to display the Fibonacci series upto a certain number.

import java.util.Scanner;

public class p26FibonacciSeries
{
  public static void main(String[] args) 
  {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter number of term : ");
      int term = input.nextInt();

      for (int i = 0; i < term; i++) 
      {
        System.out.print(fibonacci(i) + " ");
      }
  }

  public static int fibonacci(int term)
  {
    if(term == 0 || term == 1) 
    {
        return 1;
    }
    else
    {
      return fibonacci(term - 1) + fibonacci(term - 2);
    }
  }
}
