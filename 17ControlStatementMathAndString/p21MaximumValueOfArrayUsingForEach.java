// Create a program using for-each to find the maximum value in an integer array.

public class p21MaximumValueOfArrayUsingForEach
{
  public static void main(String[] args) 
  {
      int arr[] = {1,25,9,16,0,-9,2,7,11,21,77,-101,235,47,-109,65,22,2,-9,27,62};

      int max = arr[0];

      for(int element : arr)
      {
        if(max < element)
        {
          max = element;
        }
      }
      System.out.print("Maximum Element of an array is " + max);


  }
}
