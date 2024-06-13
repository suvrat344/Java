// Create a program to find the maximum and minimum element in an array

public class p13FindMaxAndMinInArray 
{
  public static void main(String[] args) 
  {
    int arr[] = {62,49,-9,9,109,57,13,93,109,295,232};

    findMinMax(arr);
  }


  // Find Minimum And Maximum Of An Array
  public static void findMinMax(int[] arr)
  {
    int minimum = arr[0], maximum = arr[0];

    for(int i = 1;i < arr.length ; i++)
    {
      if(arr[i] > maximum){
        maximum = arr[i];
      }

      if(arr[i] < minimum)
      {
        minimum = arr[i];
      }
    }

    System.out.println("Minimum value in the array : " + minimum);
    System.out.println("Maximum value in the array : " + maximum);

  }
}
