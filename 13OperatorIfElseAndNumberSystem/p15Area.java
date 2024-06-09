// Create a program to calculate the Area of a Triangle. Area of triangle = ½*B*H

import java.util.Scanner;

public class p15Area {
  public static void main(String[] args) {
      int height,base;

      Scanner input = new Scanner(System.in);

      System.out.print("Enter height of triangle : ");
      height = input.nextInt();

      System.out.print("Enter base of triangle : ");
      base = input.nextInt();

      float area = height * base / 2;
    
      System.out.println("Area of Triangle : " + area);
  }
}
