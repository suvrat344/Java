// Write a lambda expression that takes two integers and returns their multiplication. Then, apply this lambda to a pair of numbers

import java.util.Scanner;
import java.util.function.BiFunction;

public class p11Multiplication
{
  public static void main(String[] args) 
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter first number : ");
      int num1 = input.nextInt();
      System.out.print("Enter second number : ");
      int num2 = input.nextInt();

      BiFunction<Integer,Integer,Integer> multiply = (a,b) -> a * b;
      int result = multiply.apply(num1,num2);
      System.out.println("Result : " + result);
  }
}