// Write a program to accept a string input from user and print the characters at even indices.

import java.util.Scanner;

public class p12StringAtEvenIndices 
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter string : ");
    String s1 = input.nextLine();
    evenDisplay(s1);
  }

  public static void evenDisplay(String s1)
  {
      for(int i = 0;i<s1.length();i++)
      {
          if(i % 2 == 0)
          {
              System.out.print(s1.charAt(i));
          }
      }
  }
}