// Write a program to find the sum of the following series up to n terms.
// 1^2 + ( 1^2 + 2^2 ) + ( 1^2 + 2^2 + 3^2 ) + ......... + ( 1^2 + 2^2 + .... + n^2 )

import java.util.Scanner;

public class p13SeriesSum 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number of terms : ");
    int terms = input.nextInt();
    int sum = 0;

    for(int i = 1;i <= terms ;i++)
    {
        sum = sum + (i * (i+1) * (2 * i + 1))/6;
    }
    System.out.println("Sum of " + terms + " terms is " + sum); 
  }
}