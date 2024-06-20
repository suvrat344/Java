// Create a program using do-while to find password checker until a valid password is entered.

import java.util.Scanner;

public class p17passwordChecker 
{
  public static void main(String[] args)
  {
    String password = "adefg",enteredPassword;

    Scanner input = new Scanner(System.in);

    do
    {
      System.out.print("Enter password : ");
      enteredPassword = input.next();
    }while(!enteredPassword.equals(password));
    System.out.print("Password Authenicated");
  }
}
