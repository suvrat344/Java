//  Create a program using break to read inputs from the user in a loop and break the loop if a specific keyword (like "exit") is entered.

import java.util.Scanner;

public class p23UserInput 
{
  public static void main(String[] args) 
  {
      Scanner input = new Scanner(System.in);
      String user_input;

      do 
      { 
          System.out.print("Enter number : ");
          user_input = input.next();
      } while (!user_input.equals("exit"));
  }
}
