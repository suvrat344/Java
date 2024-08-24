// You are given a 2D matrix where each row is a list of integers. Your task is to write a program that performs the following:
// 1. Matrix Input:
//     Read the number of rows (n) in the matrix.
//     For each row, read a line of space-separated integers and store these integers in a list.
//     Construct the 2D matrix using these lists.
// 2. Queries:
//     Read the number of queries (q).
//     For each query, read two integers: row_index and col_index.
//     Output the element located at the specified row and column index in the matrix.
//     If the row or column index is out of bounds, output "ERROR!".
// Input
// The first line of input contains an integer n — the number of rows in the matrix.
// The next n lines each contain space-separated integers representing a row of the matrix.
// The line following these rows contains an integer q — the number of queries.
// The next q lines each contain two integers: row_index and col_index.
// Output
// For each query, print the value located at the given row and column index. If the indices are out of bounds, print "ERROR!".


import java.util.*;

public class p11TwoDimensionalArray
{
  public static void main(String[] args) 
  {
      int n;
      Scanner input = new Scanner(System.in);


      List <List<Integer>> arr = new ArrayList<>();

      System.out.print("Enter number of rows : ");
      n = input.nextInt();
      input.nextLine();

      for(int i = 0;i < n;i++)
      {
        System.out.print("Enter integer : ");
        String inp = input.nextLine();
        String[] tokens = inp.split(" ");
        List <Integer> row = new ArrayList<>();

        for(String token : tokens)
        {
          int a = Integer.parseInt(token);
          row.add(a);
        }
        arr.add(row);
      }

      System.out.print("Enter number of time you want to query : ");
      int no_of_time_query = input.nextInt();

      for(int i = 0;i < no_of_time_query;i++)
      {
        System.out.print("Enter row and column number : ");
        String inp1 = input.nextLine();
        String[] pos = inp1.split(" ");
        int row_index = Integer.parseInt(pos[0]);
        int col_index = Integer.parseInt(pos[1]);

        try
        {
          System.out.println(arr.get(row_index).get(col_index));
        }
        catch(IndexOutOfBoundsException e)
        {
          System.out.println("ERROR!");
        }
      }
  }
}