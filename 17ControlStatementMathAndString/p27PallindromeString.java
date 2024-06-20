// Create a program using recursion to check if a string is a palindrome using recursion.

import java.util.Scanner;

public class p27PallindromeString
{
  public static void main(String[] args) 
  {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter string : ");
      String sen = input.next();

      IsPallindrome(sen);
  }


  public static void IsPallindrome(String sen)
  {
    String rev = reverse(sen);

    if(rev.equals(sen)){
      System.out.print(sen + " is pallindrome string.");
    }
    else
    {
      System.out.print(sen + " is not pallindrome string.");
    }
  }


  public static String reverse(String sen)
  {
    if(sen.equals(""))
    {
      return "";
    }
    else
    {
      return reverse(sen.substring(1)) + sen.substring(0,1);
    }
  }
}
