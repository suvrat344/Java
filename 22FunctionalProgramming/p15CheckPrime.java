// Create your own functional interface with a single abstract method that accepts an integer and returns a boolean. Implement it using a lambda that checks if the number is prime.

import java.util.*;

@FunctionalInterface
interface checkPrime
{
  boolean IsPrime(int num);
}


public class p15CheckPrime
{
  public static void main(String[] args) 
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number : ");
      int num = input.nextInt();
      checkPrime prime = (x) ->{
        Boolean isPrime = true;
        for(int i = 2;i <= x / 2;i++)
        {
          if(x % i == 0)
          {
            isPrime = false;
            return isPrime;
          }
        }
        return x !=1 ? isPrime : false;
      };
      System.out.println("Prime : " + prime.IsPrime(num));
  }
}
