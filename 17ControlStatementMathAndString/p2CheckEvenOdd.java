// Create a program to find if the given number is even or odd.

import java.util.Scanner;

public class p2CheckEvenOdd
{
  public static void main(String[] args) 
  {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter number : ");
      int num = input.nextInt();

      String IsEven = num % 2 == 0 ? "Even" : "Odd";

      System.out.printf("%d is %s",num,IsEven);
  }
}
