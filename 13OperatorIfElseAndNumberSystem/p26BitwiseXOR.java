// Create a program that shows bitwise XOR of two numbers.

import java.util.Scanner;

public class p26BitwiseXOR {
  public static void main(String[] args) {
      int num1,num2;

      Scanner input = new Scanner(System.in);

      System.out.print("Enter first number : ");
      num1 = input.nextInt();

      System.out.print("Enter second number : ");
      num2 = input.nextInt();

      int bitwiseXOR = num1 ^ num2;
      System.out.printf("Bitwise XOR of %d and %d is %d",num1,num2,bitwiseXOR);
  }
}
