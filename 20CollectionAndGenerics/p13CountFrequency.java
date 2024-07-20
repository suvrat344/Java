// Use the Collections class to count the frequency of a particular element in an ArrayList.

import java.util.*;

public class p13CountFrequency 
{
  public static void main(String[] args) 
  {
      List<Integer> arr = Arrays.asList(1,4,6,4,1,7,8,1);

      System.out.print("List : " + arr);
      int count = Collections.frequency(arr, 1);
      System.out.print("\nFrequency of 1 is " + count);
  }
}
