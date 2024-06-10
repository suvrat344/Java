// Create a program that print patterns
/*
 *                  * * * * *                    *              
 * *                  * * * *                  * * 
 * * *                  * * *                * * *   
 * * * *                  * *              * * * *
 * * * * *                  *            * * * * *
 */

import java.util.Scanner;

public class p22StarPattern {
  public static void main(String[] args) {
      int row;

      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter number of rows : ");
      row = input.nextInt();

      pattern1(row);
      pattern2(row);
      pattern3(row);
  }

  static void pattern1(int row)
  {
    int i = 0,j;
    System.out.println("Pattern1");

    while(i < row)
    {
      j = 0;
      while(j <= i)
      {
        System.out.print("* ");
        j++;
      }
      System.out.println();
      i++;
    }
  }

  static void pattern2(int row)
  {
    int i = 0,j;
    System.out.println("Pattern2");

    while(i < row)
    {
      j = 0;
      while(j < row - i)
      {
        System.out.print("* ");
        j++;
      }
      System.out.println();
      i++;
    }
  }

  static void pattern3(int row)
  {
    int i = 0,j;
    System.out.println("Pattern3");

    while(i < row)
    {
      j = 0;
      while(j < row)
      {
        if(j >= row - i - 1)
        {
          System.out.print("* ");
        }
        else
        {
          System.out.print("  ");
        }
        j++;
      }
      System.out.println();
      i++;
    }
  }

}

