// Given a list of integers, use stream operations to filter odd numbers and print them.

import java.util.*;

public class p14FilterOddNumber
{
  public static void main(String[] args) 
  {
      List<Integer> arr = List.of(11,17,12,14,19,22);
      arr.stream().filter(s -> s % 2 == 1).forEach(s -> System.out.print(s + " "));
  }
}
