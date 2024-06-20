// Create a program using continue to print only even numbers using continue for odd numbers.

import java.util.Scanner;

public class p25PrintEvenNumber 
{
  public static void main(String[] args) 
  {
      Scanner input = new Scanner(System.in);
      int num;

      System.out.println("Display even number entered by user");
      do
      {
        System.out.print("Enter number : ");
        num = input.nextInt();

        if(num % 2 == 1)
        {
          continue;
        }
        System.out.println(num);
      }while(num >= 0);
  }
}
