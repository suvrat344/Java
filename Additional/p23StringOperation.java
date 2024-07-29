// Create an abstract class StringOperations that has the following abstract methods:
//     String reverse(String s)
//     int vowelCount(String s)
// Create StringReverse class that extends StringOperations class but defines only String reverse(String s) method. It reverses the string which is passed as parameter and returns the reversed string.
// Create UpdatedStrings class that extends StringReverse class and defines int vowelCount(String s) method. It counts the vowels in the string which is passed as parameter and returns the count.


import java.util.Scanner;

abstract class StringOperations
{
  public abstract String reverse(String s);
  public abstract int vowelCount(String s);
}


abstract class StringReverse extends StringOperations
{
  @Override
  public String reverse(String s)
  {
      int len = s.length();
      char[] arr = new char[len];
      char temp;
      
      for(int i = 0;i < len / 2 + 1;i++)
      {
          temp = s.charAt(i);
          arr[i] = s.charAt(len - i - 1);
          arr[len - i - 1] = temp;
      }
      return new String(arr);
  }
}


class UpdatedStrings extends StringReverse
{
  @Override
  public int vowelCount(String s)
  {
    int count = 0;
    int len = s.length();
    String s1 = s.toLowerCase();

    for(int i = 0;i < len ; i++)
    {
      if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u')
      {
        count++;
      }
    }
    return count;
  }
}


public class p23StringOperation
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter string  : ");
    String s = input.next();
    UpdatedStrings str = new UpdatedStrings();
    System.out.println("Reverse of "+ s + " is "+ str.reverse(s));
    System.out.println("Vowel count of "+ s + " is "+ str.vowelCount(s));
  }
}