// Create a program using do-while to implement a number guessing game.

import java.util.Scanner;

public class p18GuessGame 
{
  public static void main(String[] args) 
  {
    int result = 92,chosenOption,counter=0;
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to number guessing game");
    do 
    { 
        System.out.print("Enter number between 0 to 100: ");
        chosenOption = input.nextInt();
        counter++;
        if(result > chosenOption)
        {
          System.out.println("Enter larger number.");
        }
        else if(result < chosenOption)
        {
          System.out.println("Enter smaller number.");
        }
    } while (chosenOption != result);

    System.out.print("You guessed the answer in " + counter + " attempts.");
  }
}
