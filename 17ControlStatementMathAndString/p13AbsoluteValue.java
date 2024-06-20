// Create a program to calculate the absolute value of a given integer.

import java.util.Scanner;

public class p13AbsoluteValue
{
  public static void main(String[] args) 
  {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter number : ");
      int num = input.nextInt();

      int absolute_value = num < 0 ? -num : num;

      System.out.printf("Absolute value of %d is %d",num,absolute_value);
  }
}