// Create a program that takes two numbers and shows result of all arithmetic operators (+,-,*,/,%).

import java.util.Scanner;

public class p12Arithmetic {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int first,second;
    System.out.print("Enter first number : ");
    first = input.nextInt();
    System.out.print("Enter second number : ");
    second = input.nextInt();

    int add = first + second;
    int subtract = first - second;
    int product = first * second;
    float division = (float) first / second;
    int modulus = first % second;

    System.out.println(first + " + " + second + " = " + add);
    System.out.println(first + " - " + second + " = " + subtract);
    System.out.println(first + " * " + second + " = " + product);
    System.out.println(first + " / " + second + " = " + division);
    System.out.println(first + " % " + second + " = " + modulus);
  }
}
