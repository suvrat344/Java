// Create a class ArrayOperations with a static nested class Statistics. Statistics could have methods like mean(), median(), which operate on an sorted array.

class ArrayOperations
{
  public static int[] arr = {1,2,3,4,5,6,7,8,9};

  static class Statistics
  {
    public void mean()
    {
      int sum = 0;

      for (int i : arr) 
      {
        sum = sum + i;
      }
      System.out.println("Average : " + (float)sum / arr.length);
    }


    public void median()
    {
      int len = arr.length;

      if(len % 2 == 1)
      {
        System.out.println("Median : " + arr[len / 2]);
      }
      else
      {
        System.out.println("Median : " + (float) (arr[(len-1) / 2] + arr[(len-1)/2 + 1])/2);
      }
    }
  }
}

public class p16Statistics
{
  public static void main(String[] args) 
  {
      ArrayOperations.Statistics arr = new ArrayOperations.Statistics();
      arr.mean();
      arr.median();
      
  }
}
