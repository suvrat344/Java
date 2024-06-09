// Create a program that determines the greatest of the three numbers.

import java.util.Scanner;

public class p20Greatest {
  public static void main(String[] args) {
      int num1,num2,num3;

      Scanner input = new Scanner(System.in);

      System.out.print("Enter first number : ");
      num1 = input.nextInt();

      System.out.print("Enter second number : ");
      num2 = input.nextInt();

      System.out.print("Enter third number : ");
      num3 = input.nextInt();

      if (num1 > num2 && num1 > num3) {
        System.out.printf("%d is a greatest number.",num1);
      }
      else if (num2 > num3) {
        System.out.printf("%d is a greatest number.",num2);
      }
      else {
        System.out.printf("%d is a greatest number.",num3);
      }
  }
}
