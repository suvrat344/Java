// Create a program to input name of the person and respond with Welcome NAME to this site.

import java.util.Scanner;

public class p2 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your name : ");
    String name = input.nextLine();
    System.out.println("Welcome " + name + " to this site.");
  }
}
