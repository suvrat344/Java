// Create a program that shows bitwise compliment of a number.

import java.util.Scanner;

public class p27BitwiseCompliment {
  public static void main(String[] args) {
      int num1;

      Scanner input = new Scanner(System.in);

      System.out.print("Enter first number : ");
      num1 = input.nextInt();

      int bitwiseNOT = ~ num1;
      System.out.printf("Bitwise NOR of %d is %d",num1,bitwiseNOT);
  }
}
