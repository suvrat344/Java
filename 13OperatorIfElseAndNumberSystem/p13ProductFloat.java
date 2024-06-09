// Create a program to calculate product of two floating points numbers.

import java.util.Scanner;

public class p13ProductFloat {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    float first,second;

    System.out.print("Enter first number : ");
    first = input.nextFloat();

    System.out.print("Enter second number : ");
    second = input.nextFloat();

    float product = first * second;

    System.out.print(first + " * " + second + " = " + product);
  }
}
