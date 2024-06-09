// Create a program that shows bitwise OR of two numbers.

import java.util.Scanner;

public class p25BitwiseOR {
  public static void main(String[] args) {
      int num1,num2;

      Scanner input = new Scanner(System.in);

      System.out.print("Enter first number : ");
      num1 = input.nextInt();

      System.out.print("Enter second number : ");
      num2 = input.nextInt();

      int bitwiseOR = num1 | num2;
      System.out.printf("Bitwise OR of %d and %d is %d",num1,num2,bitwiseOR);
  }
}
