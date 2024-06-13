// Create a program to check if the given array is sorted.

public class p14CheckArraySorted 
{
  public static void main(String[] args) 
  {
    int arr[] = {1,2,3,4,5,6,7,8,9};

    boolean result = IsArraySorted(arr);

    if(result == true)
    {
      System.out.print("Array is Sorted");
    }
    else
    {
      System.out.print("Array is not sorted");
    }
  }


  // Check array is sorted.
  public static boolean  IsArraySorted(int[] arr)
  {
    boolean IsDesc = true,IsAsc = true;

    for(int i = 0; i < arr.length - 1; i++)
    {
      if(arr[i+1] > arr[i]){
        IsDesc = false;
      }
      else
      {
        IsAsc = false;
      }
    }
    return IsAsc || IsDesc;
  }

}
