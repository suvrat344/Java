// Create a program to reverse an array.

public class p16ReverseArray 
{
  public static void main(String[] args)
  {
    int arr[] = {1,2,3,4,5,6,7,8,9};

    reverseArray(arr);
  }


  
  // Reverse Array
  public static void reverseArray(int[] arr)
  {
    int temp;

    int len = arr.length;

    for(int i = 0;i < len / 2;i++)
    {
      temp = arr[i];
      arr[i] = arr[len - i - 1];
      arr[len -i - 1] = temp;
    }

    displayArray(arr);
  }


  
  // Display Array
  public static void displayArray(int[] arr)
  {
    int len = arr.length;

    for(int i = 0;i < len; i++)
    {
      System.out.print(arr[i] + " ");
    }
  }
}
