// Create a program to calculate simple interest.Simple Interest = (P x T x R)/100

import java.util.Scanner;

public class p16SimpleInterest {
  public static void main(String[] args) {
      int principal, rate, time;

      Scanner input = new Scanner(System.in);

      System.out.print("Enter principal amount : ");
      principal = input.nextInt();

      System.out.print("Enter rate of interest : ");
      rate = input.nextInt();

      System.out.print("Enter time period : ");
      time = input.nextInt();

      float simpleInterest =  principal * rate * time / 100;
    
      System.out.println("Simple Interest : " + simpleInterest);
  }
}