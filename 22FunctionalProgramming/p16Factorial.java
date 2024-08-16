// Write two versions of a program that calculates the factorial of a number: one using structural (procedural) programming, and the other using functional programming.

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class p16Factorial
{
  public static void main(String[] args) 
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number : ");
      int num = input.nextInt();

      int res = factorial(num);
      System.out.println("Factorial using structured programming : " + res);

      UnaryOperator<Integer> result = (x) -> {
        int fact = 1;
        for(int i = 1;i < num ;i++)
        {
          fact = fact * i;
        }
        return fact;
      };
      System.out.println("Factorial using functional programming : " + result.apply(num));
  }

  public static int factorial(int num)
  {
    int fact = 1;
    for(int i = 1;i < num ;i++)
    {
      fact = fact * i;
    }
    return fact;
  }
}
