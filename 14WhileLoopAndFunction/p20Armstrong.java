//  Create a program to check if a number is an Armstrong number.

import java.util.Scanner;

public class p20Armstrong
{
  public static void main(String[] args) 
  {
    int num;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter number : ");
    num = input.nextInt();

    armstrong(num);
  }

  public static void armstrong(int num)
  {
    int temp = num,sum=0;
    
    while(temp > 0)
    {
      sum = sum + (int) Math.pow(temp % 10,3);
      temp = temp / 10;
    }

    if(num == sum)
    {
      System.out.printf("%d is an Armstrong number.",num);
    }
    else
    {
      System.out.printf("%d is not an Armstrong number.",num);
    }
  }
}
