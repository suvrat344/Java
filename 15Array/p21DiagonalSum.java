// Create a program to find the sum of two diagonal elements.


public class p21DiagonalSum {
  public static void main(String[] args)
  {
    int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

    sumDiagonal(arr);
  }



  public static void sumDiagonal(int[][] arr)
  {
    int rightSumDiagonal = 0,leftSumDiagonal = 0,len = arr.length,common = 0;

    for(int i = 0;i < len;i++)
    {
      leftSumDiagonal = leftSumDiagonal + arr[i][i];
      rightSumDiagonal = rightSumDiagonal + arr[i][len - i - 1];
      
      if(i == len / 2 && len % 2 == 1)
      {
        common = arr[i][i];
      }
    }
    int diagonal_sum = leftSumDiagonal + rightSumDiagonal - common;

    System.out.println("Sum of Left Diagonal : " + leftSumDiagonal);
    System.out.println("Sum of Right Diagonal : " + rightSumDiagonal);
    System.out.println("Sum of diagonal elements is " + diagonal_sum);
  }
}
