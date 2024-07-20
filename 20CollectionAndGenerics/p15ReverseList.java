// Create a program that reverses the elements of a List and prints the reversed list

import java.util.*;

public class p15ReverseList
{
  public static void main(String[] args) 
  {
      List<Integer> arr = new ArrayList<>();
      Collections.addAll(arr, 1,2,3,4,5);
      System.out.println("List Before Reversing : " + arr);
      arr = arr.reversed();
      System.out.println("List After Reversing : " + arr);
  }
}