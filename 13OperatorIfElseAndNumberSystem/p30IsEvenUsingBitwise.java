// Write a program to check if a given number is even or odd using bitwise operators.

import java.util.Scanner;

public class p30IsEvenUsingBitwise {
  public static void main(String[] args) {
      int num;

      Scanner input = new Scanner(System.in);

      System.out.print("Enter number : ");
      num = input.nextInt();

      int isEven = num & 1;

      if(isEven == 0){
        System.out.print("Even Number");
      }
      else{
        System.out.print("Odd number");
      }
  }
}
