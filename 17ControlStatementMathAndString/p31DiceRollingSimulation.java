// Simulate a dice roll using Math.random() and display the outcome (1 to 6).

import java.util.Scanner;

public class p31DiceRollingSimulation
{
  public static void main(String[] args) 
  {
      Scanner input = new Scanner(System.in);

      System.out.print("How many times you want to roll a die? : ");
      int times = input.nextInt();

      while(times > 0)
      {
        System.out.println(Math.round(Math.random() * 6));
        times--;
      }
  }
}
