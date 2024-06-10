// Create a program to find the Greatest Common Divisor (GCD) of two integers.

import java.util.Scanner;

public class p16HCF 
{
  public static void main(String[] args) 
  {
    int first,second;

    Scanner input = new Scanner(System.in);
  
    System.out.print("Enter first number : ");
    first = input.nextInt();
  
    System.out.print("Enter second number : ");
    second = input.nextInt();
  
    hcf(first,second);
  }


  static void hcf(int first,int second)
  {
    int min,max,quotient,remainder,gcd;

    if(first > second)
    {
      max = first;
      min = second;
    }
    else
    {
      max = second;
      min = first;
    }

    while(true)
    {
      quotient = (int) (max / min);
      remainder = max % min;

      if(remainder == 0)
      {
        gcd = min;
        break;
      }
      max = min;
      min = remainder;
    }
    System.out.printf("HCF(%d,%d) = %d",first,second,gcd);
  }
}
