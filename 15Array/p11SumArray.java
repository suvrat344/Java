// Create a program to find the sum and average of all elements in an array.

public class p11SumArray
{
  public static void main(String[] args)
  {
    int [] arr = {32,27,53,97,52,33,21,90,29,95};

    int sum = ArraySum(arr);
    System.out.println("Sum : " + sum);
    System.out.println("Average : " + ((float) sum / arr.length));
  }

  public static int ArraySum(int[] arr)
  {
    int i = 0,sum=0;
    while(i < arr.length)
    {
      sum = sum + arr[i];
      i++;
    }
    return sum;
  }
}