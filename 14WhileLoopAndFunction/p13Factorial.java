// Write a function that calculates the factorial of a given number.

import java.util.Scanner;

public class p13Factorial {
  public static void main(String[] args){
    int n;
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter number of term : ");
    n = input.nextInt();

    factorial(n);
  }


  static void factorial(int term){
    int fact = 1,i = 1;

    while(i <= term){
      fact = fact * i; 
      i++;
    }
    System.out.printf("Factorial of %d is %d",term,fact);
  }
}
