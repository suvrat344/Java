// Create a program to swap two numbers. 

import java.util.Scanner;

public class p11Swap{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int first,second;

    System.out.print("Enter first number : ");
    first = input.nextInt();

    System.out.print("Enter second number : ");
    second = input.nextInt();

    System.out.println("Value of first number and second number before swap is " + first +","+second);
    int temp;

    temp = first;
    first = second;
    second = temp;

    System.out.println("Value of first number and second number after swap is " + first + "," + second);
  }
}