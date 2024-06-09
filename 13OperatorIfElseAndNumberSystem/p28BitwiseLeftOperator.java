// Create a program that shows use of left shift operator

import java.util.Scanner;

public class p28BitwiseLeftOperator {
  public static void main(String[] args) {
      int num1;

      Scanner input = new Scanner(System.in);

      System.out.print("Enter first number : ");
      num1 = input.nextInt();

      int bitwiseLeft = num1 << 2;
      System.out.printf("Bitwise Left Operator of %d is %d",num1,bitwiseLeft);
  }
}
