// Create a program that computes the sum of the digits of an integer.

import java.util.Scanner;

public class p14SumOfDigit {
  public static void main(String[] args) {
      int num;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number : ");
      num = input.nextInt();

      sumOfDigit(num);
  }

  
  public static void sumOfDigit(int num){
    int sum = 0;

    while(num > 0){
      sum = sum + num % 10;
      num = num / 10;
    }
    
    System.out.print("Sum of digits is " + sum);
  }

}
