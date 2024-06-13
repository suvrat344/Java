// Create a program to sum all odd numbers from 1 to a specified number N

import java.util.Scanner;

public class p12Sum {
  public static void main(String[] args){
    int n;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number of terms : ");
    n = input.nextInt();

    sum(n);
  }

  public static void sum(int term){
    int sum = 0,i=1;

    while(i <= term){
      if(i % 2 == 1){
        sum = sum + i;
      }
      i++;
    }
    System.out.print("Sum of all odd number from 1 to " + term + " is " + sum + ".");
  }
}
