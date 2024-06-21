// Take an array of words and concatenate them into a single string using StringBuilder.

import java.util.Scanner;

public class p33ConcatenateArrayIntoString
{
  public static void main(String[] args) 
  {
      StringBuilder sentence = new StringBuilder();
      String word;

      Scanner input = new Scanner(System.in);

      System.out.print("How many words you want to enter? : ");
      int counter = input.nextInt();

      for(int i = 0;i < counter; i++)
      {
        System.out.print("Enter word : ");
        word = input.next();
        sentence.append(" " + word);
      }
      System.out.print("Entered string : " + sentence);
  }
}
