// Create a program that shows use of right shift operator.

import java.util.Scanner;

public class p29BitwiseRightOperator {
  public static void main(String[] args) {
      int num1;

      Scanner input = new Scanner(System.in);

      System.out.print("Enter first number : ");
      num1 = input.nextInt();

      int bitwiseRight = num1 >> 2;
      System.out.printf("Bitwise Right Operator of %d is %d",num1,bitwiseRight);
  }
}

