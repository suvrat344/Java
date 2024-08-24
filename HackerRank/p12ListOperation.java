// You are required to write a Java program to manage a list of integers with the ability to perform a series of operations. The program should allow the user to perform insertion and deletion operations on the list.
// Below is the description of the task:
// 1. Input Handling:
//    Read an integer n which represents the number of initial elements in the list.
//    Read a line of n integers separated by spaces and store them in a list.
//    Read an integer operation which represents the number of operations to be performed.
//    For each operation, read a line to determine the type of operation:
//      If the operation is "Insert", read the position and element to be inserted and update the list accordingly.
//      If the operation is "Delete", read the position of the element to be deleted and update the list accordingly.
// 2. Program Requirements:
//    The program should prompt the user for inputs at each step.
//    After processing all operations, print the updated list.

import java.util.*;

public class p12ListOperation 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter number you want to enter : ");
    int n = input.nextInt();
    input.nextLine();

    System.out.print("Enter number separated by space: ");
    String[] inp = input.nextLine().split(" ");

    List <Integer> arr = new ArrayList<>();

    for(String token : inp)
    {
      arr.add(Integer.parseInt(token));
    }
    
    System.out.print("Enter number of operation you want to perform : ");
    int operation = input.nextInt();
    input.nextLine();

    for(int i = 0;i < operation ;i++)
    {
      System.out.print("Enter operation : ");
      String opr = input.nextLine();

      if(opr.equals("Insert"))
      {
        System.out.print("Enter position and element you want to insert : ");
        String[] inp1 = input.nextLine().trim().split(" ");
        int pos = Integer.parseInt(inp1[0]);
        int element = Integer.parseInt(inp1[1]);
        arr.add(pos,element);
      }
      else
      {
        System.out.print("Enter position of element you want to delete : ");
        int index = Integer.parseInt(input.nextLine().trim());
        arr.remove(index);
      }
    }
    System.out.print("Updated List : " + arr);
  }
}
