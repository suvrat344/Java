// Create a program to find the minimum of two numbers.

import java.util.Scanner;

public class p11Minimum
{
  public static void main(String[] args) 
  {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter first number : ");
      int first = input.nextInt();

      System.out.print("Enter second number : ");
      int second = input.nextInt();

      int minimum = first > second ? second : first;
      System.out.printf("Min(%d,%d) is %d",first,second,minimum);
  }
}