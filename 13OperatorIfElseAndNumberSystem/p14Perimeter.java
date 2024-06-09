// Create a program to calculate Perimeter of a rectangle. Perimeter of rectangle ABCD = A+B+C+D

import java.util.Scanner;

public class p14Perimeter {
  public static void main(String[] args) {
      int length,breadth;

      Scanner input = new Scanner(System.in);

      System.out.print("Enter length of rectangle : ");
      length = input.nextInt();

      System.out.print("Enter breadth of rectangle : ");
      breadth = input.nextInt();

      int Perimeter = 2 * (length + breadth);
    
      System.out.println("Perimeter of Rectangle : " + Perimeter);
  }
}
