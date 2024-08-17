// Write a Java program that accepts a string, an integer i and a character c as input. The character at position i in the given string has to be replaced by the value of c. If the index is more than the length of the string, then it updates the last character  of the given string with the value of c. If the index i is negative, then it throws an appropriate error message. Implement the function replace such that it does the following: 
// It has three parameters - a character array (for the input string), an index and a character.
// If the given index is in the range of the character array, it replaces the character at the given position; otherwise, catch  ArrayIndexOutOfBoundsException
// In catch block (catchesArrayIndexOutOfBoundsException), if the index is beyond the length of the character array, it updates the last character of the given character array.
// If the index is negative, then it rethrows the exception to forward the exception to the caller function  main

import java.util.*;

public class p34ArrayException
{
  static char[] replace(char[] arr,int index,char ch)
  {
    try
    {
      arr[index] = ch;
      return arr;
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      if(index > 0)
      {
        arr[arr.length - 1] = ch;
      }
      else
      {
        throw e;
      }
      return arr;
    }
  }

  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter string : ");
    String s1 = input.next();

    System.out.print("Enter index : ");
    int i = input.nextInt();

    System.out.print("Enter replcaed character : ");
    char c = input.next().charAt(0);

    try 
    {
        String s2 = new String(replace(s1.toCharArray(), i, c));
        System.out.println(s2);
    } 
    catch(Exception e) 
    {
        System.out.println(e.getMessage());
    }
  }
}
