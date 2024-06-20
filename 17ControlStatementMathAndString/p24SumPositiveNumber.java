// Create a program using continue to sum all positive numbers entered by the user; skip any negative numbers

import java.util.Scanner;

public class p24SumPositiveNumber 
{
  public static void main(String[] args) 
  {
      int total = 0,num;

      Scanner input = new Scanner(System.in);

      System.out.println("Press 0 to exit from loop");
      do
      {
        System.out.print("Enter number : ");
        num = input.nextInt();

        if(num < 0)
        {
          continue;
        }
        total += num;
      }while(num != 0);
      System.out.print("Sum of all positive number enter by user is " + total);
  }
}
