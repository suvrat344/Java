// Create a program that determines if a given year is a leap year (considering conditions like divisible by 4 but not 100, unless also divisible by 400)

import java.util.Scanner;

public class p21IsLeap {
  public static void main(String[] args) {
      int year;

      Scanner input = new Scanner(System.in);

      System.out.print("Enter year : ");
      year = input.nextInt();

      if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)){
        System.out.printf("%d is leap year.",year);
      }
      else{
        System.out.printf("%d is not leap year.",year);
      }
  }
}
