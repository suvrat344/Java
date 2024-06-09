// Create a program that determines if a number is positive, negative, or zero.

import java.util.Scanner;

public class p18Check {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num;

    System.out.print("Enter number : ");
    num = input.nextInt();

    if(num > 0){
      System.out.printf("%d is positive number.",num);
    }
    else if (num == 0) {
        System.out.printf("%d is zero.",num);
    }
    else{
      System.out.printf("%d is negative number.",num);
    }
  }
}
