// Create a program using for-each to the occurrences of a specific element in an array

import java.util.Scanner;

public class p22OccurenceOfAnElementUsingForEach
{
  public static void main(String[] args)
  {
    int arr[] = {1,2,6,2,1,7,1,2,8,3,5,2,7,6,9,10,0};

    int counter = 0;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter element for which you want to get their frequency : ");
    int element = input.nextInt();

    for(int search : arr)
    {
      if(element == search)
      {
        counter++;
      }
    }
    System.out.print("Occurence of " + element + " is " + counter);
  }
}
