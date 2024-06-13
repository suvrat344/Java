// Create a program to return a new array deleting a specific element.

import java.util.Scanner;

public class p15DeleteElementInArray 
{
  public static void main(String[] args) 
  {
    int arr[] = {1,2,3,4,5,6,7,8,9};
    int num;

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter number you want to delete from array : ");
    num = input.nextInt();

    DeleteElement(arr,num);
  }


  // Delete Element From Array
  public static void DeleteElement(int[] arr,int num)
  {
    int len = arr.length;

    for(int i = 0;i < len;i++)
    {
      if(arr[i] == num){
        for(int j = i;j < len-1;j++)
        {
          arr[j] = arr[j+1];
        }
        len = len - 1;
      }
    }

    displayArray(arr,len);
  }


  // Display Array
  public static void displayArray(int[] arr,int len)
  {
    for(int i = 0;i < len; i++)
    {
      System.out.print(arr[i] + " ");
    }
  }

}
