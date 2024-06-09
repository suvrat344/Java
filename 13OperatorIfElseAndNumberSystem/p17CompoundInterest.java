// Create a program to calculate Compound interest.Compound Interest = P(1 + R/100)^t

import java.util.Scanner;

public class p17CompoundInterest {
  public static void main(String[] args) {
      float principal, rate, time;

      Scanner input = new Scanner(System.in);

      System.out.print("Enter principal amount : ");
      principal = input.nextFloat();

      System.out.print("Enter rate of interest : ");
      rate = input.nextFloat();

      System.out.print("Enter time period : ");
      time = input.nextFloat();

      float amount = principal * ((float) Math.pow((1 + rate/100),time));
      float compoundInterest = amount - principal;
    
      System.out.printf("Compound Interest : %.2f", compoundInterest);
  }
}