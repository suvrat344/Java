// Write a program that asks the user to enter two integers and then divides the first by the second. The program should handle any arithmetic exceptions that may occur (like division by zero) and display an appropriate message.
// Key Points:
// • Use Scanner to read user input.
// • Implement a try-catch block to handle ArithmeticException.
// • Display a user-friendly message if division by zero occurs

import java.util.Scanner;

public class p11ArithmeticExceptionHandling
{
  public static void main(String[] args) 
  {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter first number : ");
      int num1 = input.nextInt();

      System.out.print("Enter second number : ");
      int num2 = input.nextInt();

      try
      {
        double res =  num1 / num2;
        System.out.println(res);
      }
      catch(ArithmeticException e)
      {
        System.out.println(e.getMessage());
      }
  }
}
