// Create a program to check whether a given number is prime

import java.util.Scanner;

public class p17Prime 
{
  public static void main(String[] args) 
  {
      int num;

      Scanner input = new Scanner(System.in);
      System.out.print("Enter number : ");
      num = input.nextInt();

      IsPrime(num);
  }


  public static void IsPrime(int num)
  {
    int isPrime = 1,i = 2;

    while(i <= (int) Math.sqrt(num))
    {
      if(num % i == 0)
      {
        isPrime = 0;
        break;
      }
      i++;
    }

    if(isPrime == 1 && num != 1){
      System.out.printf("%d is a prime number.",num);
    }
    else{
      System.out.printf("%d is not prime number.",num);
    }
  }

}
