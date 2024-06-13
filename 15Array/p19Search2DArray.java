// Create a program to search an element in a 2-D array.

import java.util.Scanner;

public class p19Search2DArray 
{
  public static void main(String[] args) 
  {
      int search;
      int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

      Scanner input = new Scanner(System.in);

      System.out.print("Enter number you want to search : ");
      search = input.nextInt();

      boolean found = Search(arr,search);

      if(found == true)
      {
        System.out.print("Element is found.");
      }
      else
      {
        System.out.print("Element is not found.");
      }
  }


  
  // Search Element In 2D Array
  public static boolean Search(int[][] arr,int search)
  {
    boolean isFound = false;
    int len = arr.length;

    for (int i = 0; i < len; i++) 
    {
        for (int j = 0; j < arr[i].length; j++) 
        {
            if(arr[i][j] == search)
            {
              isFound = true;
            }
        }
    }
    return isFound;
  } 
}
