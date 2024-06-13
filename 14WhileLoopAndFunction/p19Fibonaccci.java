// Create a program to print the Fibonacci series up to a certain number.

import java.util.Scanner;

public class p19Fibonaccci 
{
  public static void main(String[] args) 
  {
      int term;

      Scanner input = new Scanner(System.in);

      System.out.print("Enter term : ");
      term = input.nextInt();

      fibonacci(term);
  }

  public static void fibonacci(int term){
    int fib1 = 0,fib2 = 1,temp;

    System.out.print(fib1 + " " + fib2 + " ");

    while(term - 2 > 0)
    {
      temp = fib2;
      fib2 = fib1 + fib2;
      fib1 = temp;
      System.out.print(fib2 + " ");
      term --;
    }
  }
}
