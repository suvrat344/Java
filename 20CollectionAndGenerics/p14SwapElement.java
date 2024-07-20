// Write a method that swaps two elements in an ArrayList, given their indices

import java.util.*;

public class p14SwapElement
{
  public static void main(String[] args) 
  {
      List<Integer> arr = Arrays.asList(1,2,3,4,5);
      
      Scanner input = new Scanner(System.in);

      System.out.println("List Before Swap : " + arr);

      System.out.print("Enter index of element you want to swap : ");
      int a = input.nextInt();

      System.out.print("Enter index for which you want to swap : ");
      int b = input.nextInt();

      int temp = arr.get(a);
      arr.set(a,arr.get(b));
      arr.set(b,temp);

      System.out.println("List After Swap : " + arr);
  }
}
