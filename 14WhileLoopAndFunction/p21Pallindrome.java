// Create a program to verify if a number is a palindrome.

import java.util.Scanner;

public class p21Pallindrome {
  public static void main(String[] args) 
  {
    int num;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter number : ");
    num = input.nextInt();

    pallindrome(num);
  }


  static void pallindrome(int num)
  {
    int temp = num,rev = 0;
    
    while(temp > 0)
    {
      rev = rev * 10 + temp % 10;
      temp = temp / 10;
    }

    if(num == rev)
    {
      System.out.printf("%d is a Pallindrome number.",num);
    }
    else
    {
      System.out.printf("%d is not a Pallindrome number.",num);
    }
  }
}
