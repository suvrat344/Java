// Create a program that determines if a number is odd or even.

import java.util.Scanner;

public class p19IsEven {
  public static void main(String[] args) {
      int num;

      Scanner input = new Scanner(System.in);

      System.out.print("Enter number : ");
      num = input.nextInt();

      if (num % 2 == 0) {
        System.out.printf("%d is an even number.",num);
      }
      else{
        System.out.printf("%d is an odd number.",num);
      }
  }
}
