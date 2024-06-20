// Create a program to create a simple calculator that uses a switch statement to perform basic arithmetic operations like addition, subtraction, multiplication, and division.

import java.util.Scanner;

public class p16SimpleCalculator
{
  public static void main(String[] args) 
  {
    float result;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first number : ");
    int first = input.nextInt();

    System.out.print("Enter second number : ");
    int second = input.nextInt();

    System.out.println("Select from given options\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
    int option = input.nextInt();

    result = switch (option)
    {
      case 1 -> first + second;
      case 2 -> first - second;
      case 3 -> first * second;
      case 4 -> (float)first / second;
      default -> -1;
    };

    if(result == -1){
      System.out.print("Invalid Operation");
    }
    else
    {
      System.out.print(result);
    }
  }
}
