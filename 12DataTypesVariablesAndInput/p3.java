// Create a program to add two number.

import java.util.Scanner;

public class p3 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first number : ");
    int first = input.nextInt();

    System.out.print("Enter second number : ");
    int second = input.nextInt();

    int sum = first + second;

    System.out.print("Sum of " + first + " and " + second + " is " + sum + ".");
  }
}
