// File Not Found Exception Handling
// Write a program to read a filename from the user and display its content. The program should handle the situation where the file does not exist.
// Key Points:
// • Use Scanner to read the filename from the user.
// • Use FileReader to read the file content.
// • Implement a try-catch block to handle FileNotFoundException.
// • Display a message informing the user if the file is not found.


import java.io.*;
import java.util.*;

public class p12FileNotFoundException
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter filename : ");
    String filename = input.nextLine();

    try(FileReader reader = new FileReader(filename))
    {
      int character;

      while((character = reader.read()) != -1)
      {
        System.out.print((char) character);
      }
    }
    catch(FileNotFoundException e)
    {
      System.out.println("File not found : " + e.getMessage());
    }
    catch(IOException e)
    {
      System.out.println("An I/O error occurred: " + e.getMessage());
    }
  }
}
