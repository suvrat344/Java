//  Create a program to Based on a student's score, categorize as "High", "Moderate", or "Low" using the ternary operator (e.g., High for scores > 80, Moderate for 50-80, Low for < 50).

import java.util.Scanner;

public class p4StudentGrade
{
  public static void main(String[] args) 
  {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter score : ");
      int score = input.nextInt();

      String label = score > 80 ? "High" 
                                : score > 50 ? "Moderate"
                                : "Low";

      System.out.printf("Grade of student is %s.",label);
  }
}
