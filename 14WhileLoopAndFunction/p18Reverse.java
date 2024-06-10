// Create a program to reverse the digits of a number.

import java.util.Scanner;

public class p18Reverse
{
  public static void main(String[] args) 
  {
      int num;
      Scanner input = new Scanner(System.in);

      System.out.print("Enter number : ");
      num = input.nextInt();

      reverse(num);
  }

  static void reverse(int num)
  {
    int rev = 0,temp = num;

    while(temp > 0)
    {
      rev = rev * 10 + temp % 10;
      temp = temp / 10;
    }

    System.out.printf("Reverse of %d is %d.",num,rev);
  }
}
