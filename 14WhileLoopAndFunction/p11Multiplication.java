// Develop a program that prints the multiplication table for a given number.

import java.util.Scanner; 

public class p11Multiplication
{
  public static void main(String[] args)
  {
    int num;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number : ");
    num = input.nextInt();

    Display(num);
  }


  static void Display(int num){
    int i = 1;
    while (i <= 10) { 
        System.out.println(num + " X " + i + " = " + (num * i));
        i++;
    }
  }

}
