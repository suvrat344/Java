// Create a number guessing game where the program selects a random number, and the user has to guess it

import java.util.Scanner;

public class p32GuessGame
{
  
  public static void main(String[] args) 
  {
    long result = Math.round(Math.random() * 100);
    int chosenOption,counter=0;
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
