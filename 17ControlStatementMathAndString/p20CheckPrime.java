// Create a program using for to display if a number is prime or not.

import java.util.Scanner;

public class p20CheckPrime 
{
  public static void main(String[] args) 
  {
      int isPrime = 1;
      Scanner input = new Scanner(System.in);

      System.out.print("Enter number : ");
      int num = input.nextInt();

      for(int i = 2;i <= (int) Math.sqrt(num);i++)
      {
        if(num % i == 0)
        {
          isPrime = 0;
          break;
        }
      }

      if(isPrime == 1 && num != 1)
      {
        System.out.print(num + " is a prime number.");
      }
      else
      {
        System.out.print(num + " is not prime number.");
      }
  }
}
