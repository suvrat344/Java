// Create a program to find the Least Common Multiple (LCM) of two numbers.

import java.util.Scanner;

public class p15LCM 
{
  public static void main(String[] args) 
  {
      int first,second;

      Scanner input = new Scanner(System.in);
      System.out.print("Enter first number : ");
      first = input.nextInt();

      System.out.print("Enter second number : ");
      second = input.nextInt();

      lcm(first,second);
  }


  static void lcm(int first,int second)
  {
    int min,max = first * second;

    if(first < second)
    {
      min = first;
    }
    else
    {
      min = second;
    }

    int i = min;

    while(i <= max)
    {
      if (i % first == 0 && i % second == 0) 
      {
          System.out.printf("LCM(%d,%d) = %d",first,second,i);
          break;
      }
      i++;
    }
  }
}
