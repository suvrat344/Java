// Concatenate and Convert: Take two strings, concatenate them, and convert the result to uppercase.

import java.util.Scanner;

public class p29ConcatenateAndConvert 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first string : ");
    String first = input.nextLine();
  
    System.out.print("Enter second string : ");
    String second = input.nextLine();
  
    System.out.print("String after concatenation : " + first.concat(second).toUpperCase());
  }
}
