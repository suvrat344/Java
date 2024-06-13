// Create a program to do sum and average of all elements in a 2-D array.

public class p20TwoDimensionalArraySumAverage 
{
  public static void main(String[] args) 
  {
      int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

      arraySumAvearge(arr);

  }

  
  //Calculate Sum And Average Of 2D Array
  public static void arraySumAvearge(int[][] arr)
  {
    int len = 0,sum = 0;

    for(int i = 0; i < arr.length ; i++)
    {
      for(int j = 0;j < arr[i].length; j++)
      {
        sum = sum + arr[i][j];
        len++;
      }
    }

    System.out.println("Sum of 2D array : " + sum);
    System.out.println("Average of 2D array : " + ((float) sum / len));
  }
}
